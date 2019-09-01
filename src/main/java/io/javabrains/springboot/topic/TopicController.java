package io.javabrains.springboot.topic;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TopicController {

	//spring mvc converts the topic object to json and returns
	@RequestMapping(value="/topics")
	public String sayHi() {
		final String uri="https://www.google.com";
		RestTemplate rest=new RestTemplate();
		String result = rest.getForObject(uri,String.class );
		return result;
		
//		return Arrays.asList(
//				new Topic("spring","spring framework","desc")			);
	}
}