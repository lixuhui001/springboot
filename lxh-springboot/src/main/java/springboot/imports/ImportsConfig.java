package springboot.imports;

import org.springframework.context.annotation.Bean;
import springboot.imports.bean.ImportsTestBean1;


public class ImportsConfig {

    @Bean
    public ImportsTestBean1 importsTestBean1() {
        return new ImportsTestBean1();
    }
}
