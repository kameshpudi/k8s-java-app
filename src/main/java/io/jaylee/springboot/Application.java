package io.jaylee.springboot;

import io.dekorate.docker.annotation.DockerBuild;
import io.dekorate.option.annotation.GeneratorOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@GeneratorOptions(outputPath = "/")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

//@RestController("/api/v1/hello")
class HelloController {

	@GetMapping("/api/v1/hello")
	@ResponseBody
	public String hello(@RequestParam String name) {
		return "Hello, did you know that " + name + " invented the car?";
	}
}
