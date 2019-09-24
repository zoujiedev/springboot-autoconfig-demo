package cn.net.vienna.autoconfigdemo.auto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import cn.net.vienna.autoconfigdemo.auto.bean.HelloDemoService;

/**
 * @author zoujie
 * @descrption
 * @since 2019-9-24
 */
@EnableAutoConfiguration
public class HelloDemoAutoConfigApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(HelloDemoAutoConfigApplication.class, args);
        HelloDemoService bean = configurableApplicationContext.getBean(HelloDemoService.class);
        bean.sayHello();
    }
}
