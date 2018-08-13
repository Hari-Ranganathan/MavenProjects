/*
 * Copyright (c) 2018 Hari Prasd Ranganathan
 *
 * Licensed under the company(the "License"); you may not use this file except in compliance with the License. You may
 * obtain a copy of the License at
 *
 * 
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.freelance.password.service.impl;


import java.security.MessageDigest;

import javax.xml.bind.DatatypeConverter;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.freelance.password.constants.PasswordConstants;
import com.freelance.password.exceptions.TypeNotFoundException;
import com.freelance.password.service.IPasswordService;
import com.freelance.password.vo.PasswordVariablesVO;
import com.lambdaworks.crypto.SCryptUtil;

import io.swagger.annotations.Api;

/**
 * = _PasswordServiceImpl_
 *
 * 
 *
 * @author Hari
 *
 */
@RestController
@Api
public class PasswordServiceImpl implements IPasswordService {

    /*
     * (non-Javadoc)
     * 
     * @see com.freelance.password.service.IPasswordService#encryptPassword(java.lang.String, java.lang.String)
     */
    @Override
    public PasswordVariablesVO encryptPassword(@PathVariable(value = "password") String password,
            @PathVariable(value = "algorithm") String algorithm) {
        String hashed = null;
        PasswordVariablesVO vo = new PasswordVariablesVO();
        vo.setPassword(password);
        vo.setAlgorithm(algorithm);
        try {
            if (algorithm.equals(String.valueOf(PasswordConstants.scrypt))
                    || algorithm == String.valueOf(PasswordConstants.scrypt)) {
                int cpuValue = 16384;
                int memValue = 8;
                int paraValue = 1;
                hashed = SCryptUtil.scrypt(password, cpuValue, memValue, paraValue);
             } else if (algorithm.equals(String.valueOf(PasswordConstants.bcrypt))) {
                String gensalt = BCrypt.gensalt();
                hashed = BCrypt.hashpw(password, gensalt);
            } else if (algorithm.equals(String.valueOf(PasswordConstants.md5))
                    || algorithm == String.valueOf(PasswordConstants.md5)) {
                MessageDigest md = MessageDigest.getInstance("MD5");
                md.update(password.getBytes());
                byte[] digest = md.digest();
                hashed = DatatypeConverter.printHexBinary(digest).toUpperCase();
            } else {
                throw new TypeNotFoundException("The given " + algorithm + "is not found");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        vo.setHash(hashed);
        return vo;
    }

    
    public String hello() {
        return "Hello HP!";
    }
}
