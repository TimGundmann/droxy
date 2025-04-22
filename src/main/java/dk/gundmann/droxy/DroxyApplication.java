package dk.gundmann.droxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.*;


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
