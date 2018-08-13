/*
 * Copyright (c) 2018 Enlighted inc
 *
 * Licensed under the Enlighted(the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.enlightedinc.com
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.freelance.password.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

/**
 * = _Applciation_
 *
 * 
 *
 * @author Hari
 *
 */
@Component("com.freelance.password")
@SpringBootApplication
public class Applciation {

    public static void main(String args[]) {
        SpringApplication.run(Applciation.class, args);
    }
}
