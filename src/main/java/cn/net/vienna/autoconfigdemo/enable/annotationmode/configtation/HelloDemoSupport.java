package cn.net.vienna.autoconfigdemo.enable.annotationmode.configtation;

import cn.net.vienna.autoconfigdemo.enable.bean.HelloDemoService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zoujie
 * @descrption
 * @since 2019-9-23
 */
@Configuration
public class HelloDemoSupport {

    @Bean
    public HelloDemoService helloDemoService(){
        return new HelloDemoService();
    }
}
