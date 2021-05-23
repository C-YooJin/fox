package com.deepjin.fox.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="회원 정보", description = "아이디, 이름, 이메일 정보를 가진 모델")
public class MemberDto {

    @ApiModelProperty(value ="아이디")
    private String id;

    @ApiModelProperty(value="이름")
    private String name;

    @ApiModelProperty(value="이메일")
    private String email;
}
