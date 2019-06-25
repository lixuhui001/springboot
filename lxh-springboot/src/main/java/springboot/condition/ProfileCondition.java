package springboot.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.stereotype.Component;

@Component
public class ProfileCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String pro = conditionContext.getEnvironment().getProperty("spring_pro");
        System.out.println("ConditionContext-->pro=" + pro);
        return "test".equals(pro);
    }
}
