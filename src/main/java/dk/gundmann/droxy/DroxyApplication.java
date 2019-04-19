package dk.gundmann.droxy;

import javax.websocket.server.PathParam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@SpringBootApplication
@EnableZuulProxy
public class DroxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DroxyApplication.class, args);
	}
	
	@RestController
	@RequestMapping("/greenBlueDeploy")
	public static class GreenBlueDeploy {

		@GetMapping("/{service}/color")
		public String getColor(@PathVariable String service) {
			return "";
		}

		@PostMapping(value="/{service}/{color}")
		public void updateCurrentColor(@PathVariable String service, @PathVariable String color) {
		}

	} 

}
