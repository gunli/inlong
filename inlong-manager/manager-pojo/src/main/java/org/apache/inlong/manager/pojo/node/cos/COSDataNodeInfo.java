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

package org.apache.inlong.manager.pojo.node.cos;

import org.apache.inlong.manager.common.consts.DataNodeType;
import org.apache.inlong.manager.common.util.CommonBeanUtils;
import org.apache.inlong.manager.common.util.JsonTypeDefine;
import org.apache.inlong.manager.pojo.node.DataNodeInfo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * COS data node info
 */
@Data
@SuperBuilder
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@JsonTypeDefine(value = DataNodeType.COS)
@ApiModel("COS data node info")
public class COSDataNodeInfo extends DataNodeInfo {

    @ApiModelProperty(value = "COS bucket name")
    private String bucketName;

    @ApiModelProperty(value = "COS secret id")
    private String credentialsId;

    @ApiModelProperty(value = "COS secret key")
    private String credentialsKey;

    @ApiModelProperty(value = "COS region")
    private String region;

    public COSDataNodeInfo() {
        this.setType(DataNodeType.COS);
    }

    @Override
    public COSDataNodeRequest genRequest() {
        return CommonBeanUtils.copyProperties(this, COSDataNodeRequest::new);
    }
}
