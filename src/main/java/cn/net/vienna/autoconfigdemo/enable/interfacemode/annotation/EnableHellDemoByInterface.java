package cn.net.vienna.autoconfigdemo.enable.interfacemode.annotation;

import cn.net.vienna.autoconfigdemo.enable.interfacemode.selector.HelloDemoConfigrationSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author zoujie
 * @descrption 基于interface[编程]的enable手动装配
 * @since 2019-9-23
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(HelloDemoConfigrationSelector.class)
public @interface EnableHellDemoByInterface {
}
