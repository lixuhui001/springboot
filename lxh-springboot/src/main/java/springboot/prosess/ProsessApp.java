package springboot.prosess;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "springboot.prosess")
public class ProsessApp {

    public static void main(String[] args) {
        /*参数为指定源，从源开始执行*/
        SpringApplication.run(ProsessApp.class);
        SpringApplication springApplication= new SpringApplication(ProsessApp.class);
        springApplication.run(args);
    }
}

