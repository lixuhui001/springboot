package springboot.condition.bean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnBean(name = "conditionTestBean3Flag")
//@ConditionalOnMissingBean (name = "conditionTestBean3Flag")
public class ConditionTestBean3 {

}
@Component
class ConditionTestBean3Flag {

}
