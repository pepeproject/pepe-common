/*
 * Copyright (c) 2019 - Globo.com - ATeam
 * All rights reserved.
 *
 * This source is subject to the Apache License, Version 2.0.
 * Please see the LICENSE file for more information.
 *
 * Authors: See AUTHORS file
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.globo.pepe.common.util;

import org.junit.Test;

public class ComplianceCheckerTests {

    @Test
    public void objNotNull() {
        ComplianceChecker.throwIfNull(new Object(), null);
    }

    @Test(expected = RuntimeException.class)
    public void objIsNull() {
        ComplianceChecker.throwIfNull(null, new RuntimeException());
    }

}
