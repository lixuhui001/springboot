package springboot.event.bean;

import org.springframework.context.ApplicationEvent;

public class EventTestBean0 extends ApplicationEvent {

    public EventTestBean0(Object source) {
        super(source);
    }
}
