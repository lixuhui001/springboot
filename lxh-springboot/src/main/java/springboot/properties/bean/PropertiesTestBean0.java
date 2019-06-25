package springboot.properties.bean;

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
@PropertySources({@PropertySource("classpath:config/properties.properties"), @PropertySource("file:/D:/home/gooagoo/resource/springboot1.properties")})
public class PropertiesTestBean0 {

    //会默认读取resource下或config目录下文件application.properties
    @Value("${ip}")
    private String ip;
    @Value("${spring_pro}")
    private String spring_pro;


    @Value("${name}")
    private String name;
    @Value("${company}")
    private String company;
//    @Value("${hosts[]}")
    private List<String> hosts = new ArrayList<>() ;


    @Value("${invoice.read.url}")
    private String url;
    @Value("${invoice.read.username}")
    private String username;
    //如无配置属性则赋值默认值
    @Value("${password:9999}")
    private String password;

    @Autowired
    private Environment environment;

    public List<String> getHosts() {
        return hosts;
    }

    public void setHosts(List<String> hosts) {
        this.hosts = hosts;
    }

    public void show() {
        System.out.println(environment.getProperty("ip"));
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "PropertiesTestBean0{" +
                "ip='" + ip + '\'' +
                ", spring_pro=" + spring_pro +
                ", name=" + name +
                ", company=" + company +
                ", hosts=" + hosts +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
