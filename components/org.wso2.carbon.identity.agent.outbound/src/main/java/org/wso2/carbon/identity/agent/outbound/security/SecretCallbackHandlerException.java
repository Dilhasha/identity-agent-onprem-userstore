/*
*  Copyright (c) 2005-2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/

package org.wso2.carbon.identity.agent.outbound.security;

/**
 * Base Class for capturing any type of org.wso2.carbon.identity.agent.outbound.exception that occurs in
 * SecretCallbackHandler.
 */
class SecretCallbackHandlerException extends RuntimeException {

    /**
     * Constructs a new org.wso2.carbon.identity.agent.outbound.exception with the specified detail message.
     *
     * @param message The detail message.
     */
    SecretCallbackHandlerException(String message) {
        super(message);
    }

    /**
     * Constructs a new org.wso2.carbon.identity.agent.outbound.exception with the specified detail message and cause.
     *
     * @param message The detail message.
     * @param cause   The cause of this org.wso2.carbon.identity.agent.outbound.exception.
     */
    SecretCallbackHandlerException(String message, Throwable cause) {
        super(message, cause);
    }
}
