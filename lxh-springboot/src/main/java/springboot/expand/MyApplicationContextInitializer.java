package springboot.expand;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Iterator;

//@Component
public class MyApplicationContextInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {

        Iterator<String> iterator = configurableApplicationContext.getBeanFactory().getBeanNamesIterator();
        while (iterator.hasNext()) {
            System.out.println("BeanName :"+iterator.next());
        }
    }
}
