package springboot.expand;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("MyApplicationRunner容器已成功启动=========="+args.getOptionNames());
        System.out.println("MyApplicationRunner容器已成功启动=========="+args.getSourceArgs().length);
        System.out.println("MyApplicationRunner容器已成功启动=========="+args.getOptionValues("myname"));
    }
}
