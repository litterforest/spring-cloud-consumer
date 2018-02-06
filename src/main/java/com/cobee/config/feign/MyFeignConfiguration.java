package com.cobee.config.feign;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Contract;

@Configuration
public class MyFeignConfiguration {

	@Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }
	
}
