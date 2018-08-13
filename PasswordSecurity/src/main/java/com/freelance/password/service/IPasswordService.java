/*
 * Copyright (c) 2018 Enlighted inc
 *
 * Licensed under the Enlighted(the "License"); you may not use this file except in compliance with the License. You may
 * obtain a copy of the License at
 *
 * https://www.enlightedinc.com
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.freelance.password.service;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.freelance.password.vo.PasswordVariablesVO;

/**
 * = _IPasswordService_
 *
 * 
 * @author Hari
 *
 */
@RequestMapping(path = "/api", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
public interface IPasswordService {

    @RequestMapping(path = "hash/{password}/{algorithm}", method = RequestMethod.PUT)
    public PasswordVariablesVO encryptPassword(@PathVariable(value = "password") String password,
            @PathVariable(value = "algorithm") String algorithm);
    @RequestMapping("/hello")
    public String hello();
}
