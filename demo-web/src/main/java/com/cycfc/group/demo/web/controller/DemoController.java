package com.cycfc.group.demo.web.controller;

import com.cycfc.group.demo.entity.base.DataResponse;
import com.cycfc.group.demo.entity.request.DemoAddRequestModel;
import com.cycfc.group.demo.entity.response.DemoResponseModel;
import com.cycfc.group.demo.service.IDemoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * rest接口控制器
 */
@RestController
@RequestMapping(value = "/demo")
@Api(value = "demo-controller", description = "demo controller")
public class DemoController {

    @Autowired
    private IDemoService demoService;

    @GetMapping(value = "/get/{id}")
    @ApiOperation(value = "get")
    public DataResponse<DemoResponseModel> get(@PathVariable(value = "id") Long id) {
        return new DataResponse<>(demoService.getDemoData(id));
    }

    @PostMapping(value = "/insert")
    @ApiOperation(value = "insert")
    public DataResponse<Boolean> insert(@RequestBody DemoAddRequestModel model) {
        return new DataResponse<>(demoService.insertDemoData(model));
    }

}
