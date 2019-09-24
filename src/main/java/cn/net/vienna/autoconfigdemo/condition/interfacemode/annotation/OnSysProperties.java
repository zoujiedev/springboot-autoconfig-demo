package cn.net.vienna.autoconfigdemo.condition.interfacemode.annotation;

import cn.net.vienna.autoconfigdemo.condition.interfacemode.condition.OnSysPropertiesCondition;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * @author zoujie
 * @descrption  条件注解   类似spring中的@ConditionalOnMissingClass等注解
 * @since 2019-9-24
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(OnSysPropertiesCondition.class)
public @interface OnSysProperties {

    String name() default "";

    String value() default "";

}
