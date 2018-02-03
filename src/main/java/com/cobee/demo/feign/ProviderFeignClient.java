package com.cobee.demo.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@FeignClient("SPRING-CLOUD-PROVIDER")
public interface ProviderFeignClient {
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello();
	
}
