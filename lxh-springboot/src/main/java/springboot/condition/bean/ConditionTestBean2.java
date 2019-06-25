package springboot.condition.bean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnClass(name = "com.google.gson.Gson")
public class ConditionTestBean2
{
}
