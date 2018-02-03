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
	
	@Autowired
	private RestTemplate restTemplate;
	/*@Autowired
	private ProviderFeignClient providerFeignClient;*/
	
	/*@Autowired
	private EurekaClient discoveryClient;*/
	 
	/*@GetMapping(value = "/getproviderinfo")
    public String getproviderinfo() {
        return providerFeignClient.hello();
    }*/
	
	@GetMapping(value = "/getproviderinfo1")
	public String getproviderinfo1() {
		return restTemplate.getForObject("http://SPRING-CLOUD-PROVIDER/hello", String.class);
	}
	
	/*private String getHomePageUrl(String providerName)
	{
		InstanceInfo instance = discoveryClient.getNextServerFromEureka("SPRING-CLOUD-PROVIDER", false);
		return instance.getHomePageUrl();
	}*/
	
}
