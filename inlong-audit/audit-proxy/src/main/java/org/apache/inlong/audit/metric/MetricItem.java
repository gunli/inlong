/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.inlong.audit.metric;

import lombok.Data;

import java.util.concurrent.atomic.AtomicLong;

@Data
public class MetricItem {

    public static final String K_DIMENSION_KEY = "dimensionName";
    private AtomicLong receiveCountSuccess = new AtomicLong(0);
    private AtomicLong receivePackSuccess = new AtomicLong(0);
    private AtomicLong receiveSizeSuccess = new AtomicLong(0);
    private AtomicLong receiveCountInvalid = new AtomicLong(0);
    private AtomicLong receiveCountExpired = new AtomicLong(0);
    private AtomicLong sendCountSuccess = new AtomicLong(0);
    private AtomicLong sendCountFailed = new AtomicLong(0);
    public void resetAllMetrics() {
        receiveCountSuccess.set(0);
        receivePackSuccess.set(0);
        receiveSizeSuccess.set(0);
        receiveCountInvalid.set(0);
        receiveCountExpired.set(0);
        sendCountSuccess.set(0);
        sendCountFailed.set(0);
    }
}
