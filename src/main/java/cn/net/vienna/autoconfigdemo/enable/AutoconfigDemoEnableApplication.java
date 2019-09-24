package cn.net.vienna.autoconfigdemo.enable;

import cn.net.vienna.autoconfigdemo.enable.annotationmode.annotation.EnableHellDemoByAnnotation;
import cn.net.vienna.autoconfigdemo.enable.bean.HelloDemoService;
import cn.net.vienna.autoconfigdemo.enable.interfacemode.annotation.EnableHellDemoByInterface;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author zoujie
 * @descrption enable两种手动装配的测试 ，两个注解采用两个实现方法，注意不能同时使用，否则会报错： bean不唯一
 * @since 2019-9-23
 */
//@EnableHellDemoByInterface
@EnableHellDemoByAnnotation
public class AutoconfigDemoEnableApplication {

    public static void main(String[] args) {
        //build context使用builder可以方便添加参数，例如profile或者其他properties
        SpringApplicationBuilder builder = new SpringApplicationBuilder(AutoconfigDemoEnableApplication.class);
        ConfigurableApplicationContext configurableApplicationContext = builder.run(args);

        //获取手动装配的bean
        HelloDemoService helloDemoService = configurableApplicationContext.getBean(HelloDemoService.class);
        helloDemoService.sayHello();
    }
}
