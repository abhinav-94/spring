package io.javabrains.springboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContainer {

	@RequestMapping("/hello")
	public String sayHi() {
		return "hey there!";
	}
}
