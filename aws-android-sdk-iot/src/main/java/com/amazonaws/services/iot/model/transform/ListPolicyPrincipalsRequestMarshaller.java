/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.iot.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

import android.text.TextUtils;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for ListPolicyPrincipalsRequest
 */
public class ListPolicyPrincipalsRequestMarshaller implements
        Marshaller<Request<ListPolicyPrincipalsRequest>, ListPolicyPrincipalsRequest> {

    public Request<ListPolicyPrincipalsRequest> marshall(
            ListPolicyPrincipalsRequest listPolicyPrincipalsRequest) {
        if (listPolicyPrincipalsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListPolicyPrincipalsRequest)");
        }

        Request<ListPolicyPrincipalsRequest> request = new DefaultRequest<ListPolicyPrincipalsRequest>(
                listPolicyPrincipalsRequest, "AWSIot");
        request.setHttpMethod(HttpMethodName.GET);

        if (listPolicyPrincipalsRequest.getPolicyName() != null) {
            request.addHeader("x-amzn-iot-policy",
                    StringUtils.fromString(listPolicyPrincipalsRequest.getPolicyName()));
        }
        String uriResourcePath = "/policy-principals";
        if (listPolicyPrincipalsRequest.getMarker() != null) {
            request.addParameter("marker",
                    StringUtils.fromString(listPolicyPrincipalsRequest.getMarker()));
        }
        if (listPolicyPrincipalsRequest.getPageSize() != null) {
            request.addParameter("pageSize",
                    StringUtils.fromInteger(listPolicyPrincipalsRequest.getPageSize()));
        }
        if (listPolicyPrincipalsRequest.getAscendingOrder() != null) {
            request.addParameter("isAscendingOrder",
                    StringUtils.fromBoolean(listPolicyPrincipalsRequest.getAscendingOrder()));
        }
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
