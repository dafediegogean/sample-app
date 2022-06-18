package br.com.sample.app.health.check;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health/check")
public class HealthCheckResource {

	@GetMapping
	public String infoHealthCheck() {
		return "up";
	}
	
}
