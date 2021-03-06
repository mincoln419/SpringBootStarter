package com.main;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(locations = "classpath:/test.properties")
class ApplicationTests {

	@Autowired
	private Environment env;
	
	@Test
	void contextLoads() {
		
		assertThat(env.getProperty("mermer.name"));
		System.out.println("test::"+env.getProperty("mermer.name"));
	}

}
