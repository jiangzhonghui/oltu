/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.amber.client;

import org.apache.amber.OAuthRequest;
import org.apache.amber.OAuthResponse;

import java.io.IOException;

/**
 * The HttpConnector does the work converting executing an
 * {@link org.apache.amber.OAuthRequest} and returning an
 * {@link org.apache.amber.OAuthResponse}. This is configurable to allow some choice
 * with regard to libraries, code etc.
 *
 * An implementation MUST provide a default connector.
 *
 * @version $Id$
 */
public interface HttpConnector {

    /**
     * The execute method does the work of processing a request and returning a
     * response from the Provider.
     *
     * @param request
     * @param authorization
     * @return response
     * @throws IOException
     *             if something untoward happened, propagate the exception
     */
    OAuthResponse execute(OAuthRequest request, String authorization) throws IOException;

}
