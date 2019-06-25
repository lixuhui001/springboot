package springboot.imports;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import springboot.imports.bean.*;

import java.util.HashSet;
import java.util.Set;

//@Import 用来导入一个或多个类被spring容器管理，如果为配置类，则配置类中所有bean都被管理
@ComponentScan("springboot.imports")
@Import({ImportsTestBean0.class,ImportsConfig.class,MyImportSelector.class,MyImportBeanDefinitionRegistrar.class})
//META-INF/spring.factories下搜索org.springframework.boot.autoconfigure.EnableAutoConfiguration key对应的配置项就加入到spring容器
//
@EnableAutoConfiguration(/*exclude = ImportsTestBean4.class*/ /*excludeName ={"springboot.imports.bean.ImportsTestBean4"}*/ )
public class ImportsApp {


    //激活一个profile
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication();
        Set set = new HashSet<Class>();
        set.add(ImportsApp.class);
        application.setSources(set);
//        application.setAdditionalProfiles("test");
        ConfigurableApplicationContext context = application.run(args);
        System.out.println("success");
        System.out.println(context.getBean(ImportsTestBean0.class));
        System.out.println(context.getBean(ImportsTestBean1.class));
        System.out.println(context.getBean(ImportsTestBean2.class));
        System.out.println(context.getBean(ImportsTestBean3.class));
        System.out.println(context.getBean(ImportsTestBean4.class));
        System.out.println("end");


    }
}
