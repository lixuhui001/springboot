package springboot.imports;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import springboot.imports.bean.ImportsTestBean3;

//registerBeanDefinitions参数中有一个BeanDefinitionRegistry，可以用来往spring容器中动态的注入bean
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        BeanDefinitionBuilder beanDefinitionBuilder= BeanDefinitionBuilder.rootBeanDefinition(ImportsTestBean3.class);
        beanDefinitionRegistry.registerBeanDefinition("importsTestBean3",beanDefinitionBuilder.getBeanDefinition());
    }
}
