/*
 * Copyright (c) 2019. Globo.com - ATeam
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Authors: See AUTHORS file
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.globo.pepe.common.model.munin;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Embeddable;

@Embeddable
public class Keystone {

    private static final long serialVersionUID = 1L;

    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public Keystone setLogin(String login) {
        this.login = login;
        return this;
    }

    @JsonIgnore
    public String getPassword() {
        return password;
    }

    public Keystone setPassword(String password) {
        this.password = password;
        return this;
    }
}
