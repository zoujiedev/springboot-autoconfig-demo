package cn.net.vienna.autoconfigdemo.enable.annotationmode.annotation;

import cn.net.vienna.autoconfigdemo.enable.annotationmode.configtation.HelloDemoSupport;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author zoujie
 * @descrption  基于模式注解的enable手动装配
 * @since 2019-9-23
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(HelloDemoSupport.class)
public @interface EnableHellDemoByAnnotation {
}
