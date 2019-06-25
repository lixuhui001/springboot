package springboot.event;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import springboot.event.bean.EventTestBean0;

@Component
public class MyEventHandle {
    @EventListener
    public void onApplicationEvent(EventTestBean0 eventTestBean) {
        System.out.println("MyEventHandle接收EventTestBean0事件:  " + eventTestBean.getClass().getName());
    }

    @EventListener
    public void event2(ContextStoppedEvent eventTestBean) {
        System.out.println("MyEventHandle接收ContextStoppedEvent事件:  " + eventTestBean.getClass().getName());
    }

    @EventListener
    public void event2(ContextClosedEvent eventTestBean) {
        System.out.println("MyEventHandle接收ContextClosedEvent事件:  " + eventTestBean.getClass().getName());
    }
}
