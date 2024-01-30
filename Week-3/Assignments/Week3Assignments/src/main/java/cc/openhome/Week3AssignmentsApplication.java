package cc.openhome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("cc.openhome")
public class Week3AssignmentsApplication {

    public static void main(String[] args) {
        SpringApplication.run(Week3AssignmentsApplication.class, args);
    }
    
}