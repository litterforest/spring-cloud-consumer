package com.cobee.demo.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cobee.config.feign.MyFeignConfiguration;

import feign.RequestLine;

@FeignClient(name = "SPRING-CLOUD-PROVIDER", configuration = MyFeignConfiguration.class)
public interface ProviderFeignClient {
	
//	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	@RequestLine("GET /hello")
	public String hello();
	
}
