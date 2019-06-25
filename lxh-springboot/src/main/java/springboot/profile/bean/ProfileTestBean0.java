package springboot.profile.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@ConfigurationProperties()
public class ProfileTestBean0 {

    //会默认读取resource下或config目录下文件application.properties
    @Value("${ip}")
    private String ip;
    @Value("${spring_pro}")
    private String spring_pro;

    @Override
    public String toString() {
        return "ProfileTestBean0{" +
                "ip='" + ip + '\'' +
                ", spring_pro='" + spring_pro + '\'' +
                '}';
    }
}
