package springboot.event;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import springboot.event.bean.EventTestBean0;

@SpringBootApplication
public class EventApp {


    //激活一个profile
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(EventApp.class);
        // 1.application.addListeners监听器加入到spring容器中去,
        // 2.或在监听器中加入注解进行spring管理
        // 3.在配置文件中添加 context.listener.classes=springboot.event.MyApplicationListener，参照DelegatingApplicationListener
        // 4.对监听方法  @EventListener注解，监听方法接收到事件为入参及其子事件，参照EventListenerMethodProcessor
        application.addListeners(new MyApplicationListener());
        ConfigurableApplicationContext context = application.run(args);
        System.out.println("success");
//SpringApplication继承ApplicationEventPublisher发布事件
        context.publishEvent(new EventTestBean0(new Object()));

        context.stop();

    }
}
