package com.cobee.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cobee.demo.feign.ProviderFeignClient;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

@RestController
public class ConsumerController {
	
	/*@Autowired
	private RestTemplate restTemplate;*/
	@Autowired
	private ProviderFeignClient providerFeignClient;
	
	/*@Autowired
	private EurekaClient discoveryClient;*/
	 
	@GetMapping(value = "/getproviderinfo")
    public String getproviderinfo() {
        return providerFeignClient.hello();
    }
	
	/*private String getHomePageUrl(String providerName)
	{
		InstanceInfo instance = discoveryClient.getNextServerFromEureka("SPRING-CLOUD-PROVIDER", false);
		return instance.getHomePageUrl();
	}*/
	
}