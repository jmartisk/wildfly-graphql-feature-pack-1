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

package org.wildfly.extras.graphql.test.multipledeployments.context.dep2;

public class Foo2 {

    private Integer foo2field1;

    public Foo2(Integer foo2field1) {
        this.foo2field1 = foo2field1;
    }

    public Integer getFoo2field1() {
        return foo2field1;
    }

    public void setFoo2field1(Integer foo2field1) {
        this.foo2field1 = foo2field1;
    }
}
