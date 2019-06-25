package springboot.properties.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@PropertySource("classpath:config/db1.properties")
@ConfigurationProperties()
public class PropertiesTestBean1 {

    private String name;
    private String company;
    private List<String> hosts = new ArrayList<>();
    private String[] ports;

    public List<String> getHosts() {
        return hosts;
    }

    public void setHosts(List<String> hosts) {
        this.hosts = hosts;
    }

    public String[] getPorts() {
        return ports;
    }

    public void setPorts(String[] ports) {
        this.ports = ports;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void show() {
        System.out.println("name= " + name);
        System.out.println("company= " + company);
        for (int i = 0; i < hosts.size(); i++) {
            String host = hosts.get(i);
            System.out.println("host= " + host);
        }
        for (int i = 0; i < ports.length; i++) {
            String port = ports[i];
            System.out.println(port);
            System.out.println("port= " + port);


        }

    }
}
