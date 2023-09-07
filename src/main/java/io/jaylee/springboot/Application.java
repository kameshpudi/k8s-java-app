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

@RestController("/hello")
class HelloController {

	@GetMapping
	public String hello() {
		return "Hello World!";
	}
}
