package springboot.expand;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Order(2)

//CommandLineRunner,,接口实在spring容器启动成功后的最后一次回调

public class MyCommandLineRunner2 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("MyCommandLineRunner2:容器已成功启动=========="+ new Date());
    }
}
