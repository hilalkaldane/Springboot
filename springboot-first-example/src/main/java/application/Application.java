package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication /*To tell webserver that it is the springboot application*/
public class Application {
 public static void main(String args[])
 {
	 SpringApplication.run(Application.class, args);
 } 
}
