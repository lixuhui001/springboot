package springboot.enable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableAsync;
import springboot.enable.bean.EnableTestBean0;
import springboot.enable.bean.EnableTestBean1;

import java.util.HashSet;
import java.util.Set;

//@EnableConfigurationProperties 启用某特性，将配置文件中的属性放入bean中去 配合@ConfigurationProperties
//@EnableAsync 启用异步， 配合@Async
@SpringBootApplication
@ComponentScan("springboot.enable")
@EnableAsync
@PropertySource("classpath:config/enable.properties")
public class EnableApp {


    //激活一个profile
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication();
        Set set = new HashSet<Class>();
        set.add(EnableApp.class);
        application.setSources(set);
//        application.setAdditionalProfiles("test");
        ConfigurableApplicationContext context = application.run(args);
        System.out.println("success");
        System.out.println(context.getBean(EnableTestBean0.class));
        context.getBean(EnableTestBean1.class).run();
//        context.getBean(EnableTestBean1.class).run1();
        System.out.println("end");


    }
}
