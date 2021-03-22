package com.chen.conductorbackend.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "救援任务")
public class Task {
    private Integer id;
    @ApiModelProperty(name = "lostName", value = "走失者姓名", dataType = "String")
    private String lostName;
    @ApiModelProperty(name = "lostAge", value = "走失者年龄", dataType = "Integer")
    private Integer lostAge;
    @ApiModelProperty(name = "lostGender", value = "走失者性别", dataType = "String")
    private String lostGender;
    @ApiModelProperty(name = "photo", value = "老人图片url", dataType = "String")
    private String photo;
    @ApiModelProperty(name = "longitude", value = "走失地经度", dataType = "Double")
    private Integer longitude;
    @ApiModelProperty(name = "latitude", value = "走失地纬度", dataType = "Double")
    private Integer latitude;
    @ApiModelProperty(name = "lostAddress", value = "走失者的家庭住址", dataType = "String")
    private String lostAddress;
    @ApiModelProperty(name = "lostPhone", value = "走失者家属的联系方式", dataType = "String")
    private String lostPhone;
    @ApiModelProperty(name = "detail", value = "走失者的详细信息", dataType = "String")
    private String detail;
    @ApiModelProperty(name = "lostStatus", value = "救援任务的状态", dataType = "String")
    private String lostStatus;
    @ApiModelProperty(name = "rescueNum", value = "参与该案件的队员人数", dataType = "Integer")
    private Integer rescueNum;
    @ApiModelProperty(name = "gmtCreate", value = "任务创建时间", dataType = "Long")
    private Long gmtCreate;
    @ApiModelProperty(name = "gmtModified", value = "任务修改时间", dataType = "Long")
    private Long gmtModified;
}
