package com.cycfc.group.demo.entity.response;

import lombok.Data;

import java.util.Date;

@Data
public class DemoResponseModel {

    private Long id;

    private String name;

    private Date createTime;

    private Date updateTime;

}
