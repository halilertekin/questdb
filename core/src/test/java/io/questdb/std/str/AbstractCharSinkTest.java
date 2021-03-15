/*******************************************************************************
 *     ___                  _   ____  ____
 *    / _ \ _   _  ___  ___| |_|  _ \| __ )
 *   | | | | | | |/ _ \/ __| __| | | |  _ \
 *   | |_| | |_| |  __/\__ \ |_| |_| | |_) |
 *    \__\_\\__,_|\___||___/\__|____/|____/
 *
 *  Copyright (c) 2014-2019 Appsicle
 *  Copyright (c) 2019-2020 QuestDB
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 ******************************************************************************/

package io.questdb.std.str;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AbstractCharSinkTest {
    private StringSink sink;

    @Before
    public void setUp() {
        sink = new StringSink();
    }

    @Test
    public void putFloatDirect() {
        sink.putDirect(55.78F);
        Assert.assertEquals("55.78", sink.toString());
    }

    @Test
    public void putDoubleDirect() {
        sink.putDirect(55.78D);
        Assert.assertEquals("55.78", sink.toString());
    }

    @Test
    public void putDoubleWithScaleDirect() {
        sink.putDirect(55.78D, 1);
        Assert.assertEquals("55.8", sink.toString());
    }
}
