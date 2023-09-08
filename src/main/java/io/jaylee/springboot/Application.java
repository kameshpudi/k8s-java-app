package io.jaylee.springboot;

import io.dekorate.docker.annotation.DockerBuild;
import io.dekorate.option.annotation.GeneratorOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@GeneratorOptions(outputPath = "/")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

@RestController
class HelloController {

	@GetMapping("/api/v1/hello")
	@ResponseBody
	public String hello(@RequestParam(name="name", required=false, defaultValue="Carl Benz") String name) {
		return "Hello, did you know that " + name + "invented the car?";
	}
}