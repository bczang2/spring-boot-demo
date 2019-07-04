package com.cycfc.group.demo.service.impl;

import com.cycfc.group.demo.dao.DemoMapper;
import com.cycfc.group.demo.entity.persistent.Demo;
import com.cycfc.group.demo.entity.request.DemoAddRequestModel;
import com.cycfc.group.demo.entity.response.DemoResponseModel;
import com.cycfc.group.demo.service.IDemoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Objects;

/**
 * 业务逻辑处理服务层
 */
@Service
public class DemoServiceImpl implements IDemoService {

    @Autowired
    private DemoMapper demoMapper;

    @Override
    public DemoResponseModel getDemoData(Long id) {
        if (Objects.isNull(id)) {
            return null;
        }

        DemoResponseModel result = new DemoResponseModel();
        Demo demo = demoMapper.selectByPrimaryKey(id);
        if (Objects.nonNull(demo)) {
            BeanUtils.copyProperties(demo, result);
        }

        return result;
    }

    @Override
    public Boolean insertDemoData(DemoAddRequestModel model) {
        Assert.notNull(model, "model is null");
        Demo insertModel = new Demo();
        BeanUtils.copyProperties(model, insertModel);
        return demoMapper.insertSelective(insertModel) > 0;
    }
}
