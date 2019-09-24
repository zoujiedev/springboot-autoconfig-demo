package cn.net.vienna.autoconfigdemo.enable.interfacemode.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author zoujie
 * @descrption
 * @since 2019-9-23
 */
public class HelloDemoConfigrationSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"cn.net.vienna.autoconfigdemo.enable.bean.HelloDemoService"};
    }
}
