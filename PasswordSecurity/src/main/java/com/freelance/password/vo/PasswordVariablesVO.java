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

package com.freelance.password.vo;


/**
 * = _PasswordVariablesVO_
 *
 *  @author Hari
 *
 */
public class PasswordVariablesVO {

    private String password;
    private String hash;
    private String algorithm;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public String toString() {
        return "PasswordVariablesVO [password=" + password + ", hash=" + hash + ", algorithm=" + algorithm + "]";
    }

}
