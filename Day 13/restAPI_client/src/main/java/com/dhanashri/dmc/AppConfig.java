package com.dhanashri.dmc;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
	public RestTemplate restTemplateBean() {
		return new restTemplate();
	}

}
