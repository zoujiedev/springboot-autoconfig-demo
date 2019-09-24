package cn.net.vienna.autoconfigdemo.condition.profilemode.service.impl;

import cn.net.vienna.autoconfigdemo.condition.profilemode.service.IHelloDemoService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author zoujie
 * @descrption
 * @since 2019-9-23
 */
@Profile("test")
@Service
public class HelloDemoServiceForTest implements IHelloDemoService {
    @Override
    public void sayHello() {
        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>\nI am bean of HelloDemoServiceForTest\n<<<<<<<<<<<<<<<<<<<<<<<<");
    }
}
