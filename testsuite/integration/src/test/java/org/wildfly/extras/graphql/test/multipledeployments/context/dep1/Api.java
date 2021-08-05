/*
 * Copyright 2020 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wildfly.extras.graphql.test.multipledeployments.context.dep1;

import io.smallrye.graphql.api.Context;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

import javax.inject.Inject;
import javax.json.JsonArray;

@GraphQLApi
public class Api {

    @Inject
    Context context;

    @Query
    public Foo1 foo1() {
        JsonArray selectedFields = context.getSelectedFields();
        if(!selectedFields.getJsonString(0)
            .getString()
            .equals("foo1field1")) {
                throw new RuntimeException("Incorrect selectedFields");
        }
        return new Foo1(84);
    }
}
