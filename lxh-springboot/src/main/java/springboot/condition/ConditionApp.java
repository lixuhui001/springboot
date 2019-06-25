package springboot.condition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import springboot.condition.bean.ConditionTestBean0;
import springboot.condition.bean.ConditionTestBean1;
import springboot.condition.bean.ConditionTestBean2;
import springboot.condition.bean.ConditionTestBean3;

import java.util.HashSet;
import java.util.Set;

////基于条件的自动配置，偶那么【饿哦饥饿condition接口一起使用，接口存在一个或者多个实现类都返回true的时候，才进行装配，可用在方法上,也可以用于类上面
@SpringBootApplication
@ComponentScan("springboot.condition")
public class ConditionApp {


    //激活一个profile
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication();
        Set set = new HashSet<Class>();
        set.add(ConditionApp.class);
        application.setSources(set);
        application.setAdditionalProfiles("test");
        ConfigurableApplicationContext context = application.run(args);
        System.out.println("success");

        System.out.println(context.getEnvironment().getProperty("spring_pro"));
        System.out.println(context.getBean(ConditionTestBean0.class));
        System.out.println(context.getBean(ConditionTestBean1.class));
        System.out.println(context.getBean(ConditionTestBean2.class));
        System.out.println(context.getBean(ConditionTestBean3.class));
    }
}
