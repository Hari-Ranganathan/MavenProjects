/*
 * Copyright (c) 2018 Hari Prasad Ranganathan
 *
 * Licensed under the Company(the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.freelance.password.exceptions;

public class TypeNotFoundException extends Exception {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 7774672320471035185L;
    
    public TypeNotFoundException(String message) {
        super(message);
    }

}
