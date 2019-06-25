package springboot.imports;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

//方法的返回值必须是一个class全称，引入则被spring容器托管
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"springboot.imports.bean.ImportsTestBean2"};
    }
}
