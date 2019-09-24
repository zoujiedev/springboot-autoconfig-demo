package cn.net.vienna.autoconfigdemo.condition;

import cn.net.vienna.autoconfigdemo.condition.bean.HelloDemoService;
import cn.net.vienna.autoconfigdemo.condition.interfacemode.annotation.OnSysProperties;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @author zoujie
 * @descrption
 * @since 2019-9-24
 */
public class AutoconfigDemoConditionApplication {


    @Bean
    @OnSysProperties(name = "user.country",value = "CN")
    public HelloDemoService helloDemoService(){
        return new HelloDemoService();
    }

        public static void main(String[] args) {
            SpringApplicationBuilder builder = new SpringApplicationBuilder(AutoconfigDemoConditionApplication.class);

            ConfigurableApplicationContext configurableApplicationContext = builder.run(args);

            HelloDemoService helloDemoService = configurableApplicationContext.getBean(HelloDemoService.class);
            helloDemoService.sayHello();
        }
}
