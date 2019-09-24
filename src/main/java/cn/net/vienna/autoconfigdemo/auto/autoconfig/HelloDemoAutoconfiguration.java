package cn.net.vienna.autoconfigdemo.auto.autoconfig;

import cn.net.vienna.autoconfigdemo.auto.bean.HelloDemoService;
import cn.net.vienna.autoconfigdemo.condition.interfacemode.annotation.OnSysProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;

/**
 * @author zoujie
 * @descrption  自动配置类，类似于其他的starter的autoConfiguration自动配置类
 *              同时可以加上相关的条件注解，例如可以配置之前定义的条件注解使用
 * @since 2019-9-24
 */

//@OnSysProperties(name = "user.name",value = "pc")
//@ConditionalOnMissingClass("HelloDemoService.class")
public class HelloDemoAutoconfiguration {

    @Bean
    public HelloDemoService helloDemoService(){
        return new HelloDemoService();
    }
}
