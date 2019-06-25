package springboot.enable.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "tomcat")
public class EnableTestBean0
{
    private  String hosts;
    private  Integer port;

    public String getHosts() {
        return hosts;
    }

    public void setHosts(String hosts) {
        this.hosts = hosts;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "EnableTestBean0{" +
                "hosts='" + hosts + '\'' +
                ", port=" + port +
                '}';
    }
}
