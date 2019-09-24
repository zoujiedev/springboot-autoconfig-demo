package cn.net.vienna.autoconfigdemo.condition;

import cn.net.vienna.autoconfigdemo.condition.profilemode.service.IHelloDemoService;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author zoujie
 * @descrption    profile配置装配测试类
 *                @ComponentScan  用于spring能够扫描到定义的两个实现类
 * @since 2019-9-23
 */
@ComponentScan(basePackages = "cn.net.vienna.autoconfigdemo.condition.profilemode")
public class AutoconfigDemoProfileApplication {

    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(AutoconfigDemoProfileApplication.class);
        builder.profiles("dev");
//        builder.profiles("test");

        ConfigurableApplicationContext configurableApplicationContext = builder.run(args);

        IHelloDemoService helloDemoService = configurableApplicationContext.getBean(IHelloDemoService.class);
        helloDemoService.sayHello();
    }
}
