package com.javatechie.spring.jenkins;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringJenkinsProjectApplication.class);
		return nothing;
<<<<<<< HEAD
		return none;
=======
		return something;
>>>>>>> c1f028bd9be8488e6ecc61a968b70c58d257f801
	}

}
