package com.wsq.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wsq.api.IProvider;

@Service
@org.springframework.stereotype.Service
public class ProviderImpl implements IProvider{
    @Override
    public String provide() {
        return "123";
    }
}