package springboot.profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import springboot.profile.bean.ProfileTestBean0;
import springboot.profile.bean.ProfileTestBean1;

import java.util.HashSet;
import java.util.Set;

//@Import 用来导入一个或多个类被spring容器管理，如果为配置类，则配置类中所有bean都被管理
@SpringBootApplication
@ComponentScan("springboot.profile")
public class ProfileApp {


    //激活一个profile
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication();
        Set set = new HashSet<Class>();
        set.add(ProfileApp.class);
        application.setSources(set);
        application.setAdditionalProfiles("test");
        ConfigurableApplicationContext context = application.run(args);
        System.out.println("success");
        System.out.println(context.getBean(ProfileTestBean0.class));
        System.out.println(context.getBean(ProfileTestBean1.class));



    }
}
