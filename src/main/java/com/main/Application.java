package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@GetMapping("/hello")
	public String hello() {

		return "Say yo";
	}
	
	public static void main(String[] args) {
		SpringApplication app = new  SpringApplication(Application.class);
		app.addListeners(new SampleListenser());//bean등록 할 필요가 없음.
		app.setWebApplicationType(WebApplicationType.SERVLET);
		/* 
		 * 기본적으로 servlet
		 * sevlet이 없고 web-plugs 있으면 reactive
		 * 둘다 없으면 none
		 * */
		app.run(args);
	}

}
