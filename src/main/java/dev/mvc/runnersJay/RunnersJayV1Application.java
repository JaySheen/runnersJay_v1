package dev.mvc.runnersJay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"dev.mvc"})
public class RunnersJayV1Application {

	public static void main(String[] args) {
		SpringApplication.run(RunnersJayV1Application.class, args);
	}

}
