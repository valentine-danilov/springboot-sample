package by.danilov;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "by.danilov")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
