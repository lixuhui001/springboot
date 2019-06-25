package springboot.expand;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ExpandApp {


    //激活一个profile
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ExpandApp.class);
        application.setBannerMode(Banner.Mode.OFF);
        //ApplicationContextInitializer,接口实在spring容器中执行refresh之前的一个回调
        /*使用：
        *   1.继承ApplicationContextInitializer，并application.addInitializers注册spring容器中
        *   2.在配置文件中添加 context.initializer.classes=springboot.expand.MyApplicationContextInitializer
        *   3.（外部）spring.factories文件中加入org.springframework.context.ApplicationContextInitializer=springboot.expand.MyApplicationContextInitializer

         * */
        application.addInitializers(new MyApplicationContextInitializer());
        //CommandLineRunner,,接口实在spring容器启动成功后的最后一次回调,@order越小越先执行
        /*使用：
        *   1.继承CommandLineRunner，并对其进行注解spring管理
        *
        *   */
        //ApplicationRunner,接口实在spring容器启动成功后的最后一次回调,@order越小越先执行
        /*使用：
         *   1.继承ApplicationRunner，并对其进行注解spring管理
         *   2.相对CommandLineRunner的参数是最原始参数未做处理，ApplicationRunner参数是ApplicationArguments，是对原始参数做了进一步处理
         *   3.
         *   */
        ConfigurableApplicationContext context = application.run(args);
        System.out.println("success");
        context.stop();

    }
}
