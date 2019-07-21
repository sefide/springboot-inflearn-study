package me.sefide.springinit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringinitApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringinitApplication.class);
//        app.addListeners(new SampleListener());
        app.setWebApplicationType(WebApplicationType.REACTIVE);
        app.run(args);
//        SpringApplication.run(SpringinitApplication.class, args);


    }
}


