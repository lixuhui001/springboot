package springboot.properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertiesPropertySource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MyEnvironmentPostProcessor implements EnvironmentPostProcessor {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        try {
            InputStream inputStream = new FileInputStream("/home/gooagoo/resource/springboot2.properties");
            Properties properties = new Properties();
            properties.load(inputStream);
            PropertiesPropertySource propertiesPropertySource = new PropertiesPropertySource("springboot2", properties);
            environment.getPropertySources().addLast(propertiesPropertySource);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
