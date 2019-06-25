package springboot.properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import springboot.imports.ImportsConfig;
import springboot.imports.bean.ImportsTestBean0;
import springboot.imports.bean.ImportsTestBean1;
import springboot.properties.bean.PropertiesTestBean0;
import springboot.properties.bean.PropertiesTestBean1;

import java.util.HashSet;
import java.util.Set;

//@Import 用来导入一个或多个类被spring容器管理，如果为配置类，则配置类中所有bean都被管理
@SpringBootApplication
@ComponentScan("springboot.properties")
public class PropertiesApp {


    //激活一个profile
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication();
        Set set = new HashSet<Class>();
        set.add(PropertiesApp.class);
        application.setSources(set);
//        application.setAdditionalProfiles("test");
        ConfigurableApplicationContext context = application.run(args);

        System.out.println("springboot2.read.username=" + context.getEnvironment().getProperty("springboot2.read.username"));

        System.out.println(context.getEnvironment().getProperty("spring_pro"));
        context.getBean(PropertiesTestBean0.class).show();
//        context.getBean(PropertiesTestBean1.class).show();


    }
}
