/*  
Copyright [2013-2015] eBay Software Foundation
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
    http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
package io.parallec.core.actor.message;


/**
 * Receive count from the manager to asst manager; for flow control.
 *
 * @author Yuanteng (Jeff) Pei
 */
public class ResponseCountToBatchSenderAsstManager {

    /** The response count. */
    private final int responseCount;

    /**
     * Instantiates a new response count to batch sender asst manager.
     *
     * @param responseCount
     *            the response count
     */
    public ResponseCountToBatchSenderAsstManager(int responseCount) {
        super();
        this.responseCount = responseCount;
    }

    /**
     * Gets the response count.
     *
     * @return the response count
     */
    public int getResponseCount() {
        return responseCount;
    }

}
