package dk.gundmann.droxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class DroxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DroxyApplication.class, args);
	}
	
}
