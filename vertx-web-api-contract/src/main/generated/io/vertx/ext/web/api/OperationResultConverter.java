/*
 * Copyright (c) 2014 Red Hat, Inc. and others
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.vertx.ext.web.api;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;

/**
 * Converter for {@link io.vertx.ext.web.api.OperationResult}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.ext.web.api.OperationResult} original class using Vert.x codegen.
 */
 class OperationResultConverter {

   static void fromJson(JsonObject json, OperationResult obj) {
    if (json.getValue("payload") instanceof String) {
      obj.setPayload(io.vertx.core.buffer.Buffer.buffer(java.util.Base64.getDecoder().decode((String)json.getValue("payload"))));
    }
    if (json.getValue("statusCode") instanceof Number) {
      obj.setStatusCode(((Number)json.getValue("statusCode")).intValue());
    }
  }

   static void toJson(OperationResult obj, JsonObject json) {
    if (obj.getPayload() != null) {
      json.put("payload", obj.getPayload().getBytes());
    }
    if (obj.getStatusCode() != null) {
      json.put("statusCode", obj.getStatusCode());
    }
  }
}