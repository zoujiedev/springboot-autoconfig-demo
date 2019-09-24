package cn.net.vienna.autoconfigdemo.condition.interfacemode.condition;

import cn.net.vienna.autoconfigdemo.condition.interfacemode.annotation.OnSysProperties;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * @author zoujie
 * @descrption  实现接口Condition的matches方法，用于逻辑判断条件注解下配置是否生效
 *              conditionContext是spring的应用上下文，包含bean、beanFactory、environment、properties、profile等信息
 *              annotatedTypeMetadata 是注解上的元数据，包含定义的属性等信息
 * @since 2019-9-24
 */
public class OnSysPropertiesCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //获取注解自定义条件注解上定义的属性
        Map<String, Object> attributes = annotatedTypeMetadata.getAnnotationAttributes(OnSysProperties.class.getName());


        String name = String.valueOf(attributes.get("name"));
        String value = String.valueOf(attributes.get("value"));
        //获取元数据  这里我们获取系统语言环境参数
        String property = conditionContext.getEnvironment().getProperty(name);
        return value.equals(property);
    }
}
