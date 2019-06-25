package springboot.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import springboot.event.bean.EventTestBean0;

@Component
public class MyApplicationListener implements ApplicationListener<EventTestBean0> {
    @Override
    public void onApplicationEvent(EventTestBean0 eventTestBean0) {
        System.out.println("接收事件:  "+ eventTestBean0.getClass().getName());
    }
}
