package com.cycfc.group.demo.service;

import com.cycfc.group.demo.entity.request.DemoAddRequestModel;
import com.cycfc.group.demo.entity.response.DemoResponseModel;

public interface IDemoService {

    /**
     * get
     * @param id
     * @return
     */
    DemoResponseModel getDemoData(Long id);

    /**
     * insert
     * @param model
     * @return
     */
    Boolean insertDemoData(DemoAddRequestModel model);
}
