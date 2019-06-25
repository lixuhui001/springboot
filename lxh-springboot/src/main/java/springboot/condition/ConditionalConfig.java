package springboot.condition;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import springboot.condition.bean.ConditionTestBean0;
import springboot.condition.bean.ConditionTestBean1;

@Component
@PropertySource("classpath:config/condition.properties")
public class ConditionalConfig {


    @Bean
    @Conditional(ProfileCondition.class)
    public ConditionTestBean0 conditionTestBean0() {
        System.out.println("profileTeacher=test");
        return new ConditionTestBean0();
    }

    @Bean
    @ConditionalOnProperty(name = "conditionflag", havingValue = "true", matchIfMissing = true)
    public ConditionTestBean1 conditionTestBean1() {
        System.out.println("ConditionalOnProperty.conditionflag=true");
        return new ConditionTestBean1();
    }
}
