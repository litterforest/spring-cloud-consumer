package com.cobee.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cobee.demo.feign.ProviderFeignClient;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class ConsumerController {
	
//	@Autowired
//	private RestTemplate restTemplate;
	/**
	 * 使用feign客户端
	 */
	@Autowired
	private ProviderFeignClient providerFeignClient;
//	@Autowired
//    private LoadBalancerClient loadBalancerClient;
	
	/*@Autowired
	private EurekaClient discoveryClient;*/
	
	@GetMapping(value = "/getproviderinfo")
//	@HystrixCommand(fallbackMethod = "getproviderinfoFallback")
    public String getproviderinfo() {
        return providerFeignClient.hello();
    }
	
	public String getproviderinfoFallback() {
		return "This is a hystrix fallback.";
	}
	
//	@GetMapping(value = "/getproviderinfo1")
//	public String getproviderinfo1() {
//		System.out.println(restTemplate.hashCode());
//		return restTemplate.getForObject("http://SPRING-CLOUD-PROVIDER/hello", String.class);
//	}
	
	/*private String getHomePageUrl(String providerName)
	{
		InstanceInfo instance = discoveryClient.getNextServerFromEureka("SPRING-CLOUD-PROVIDER", false);
		return instance.getHomePageUrl();
	}*/
	
//	@GetMapping("/testRibbonRule")
//	public String testRibbonRule()
//	{
//		ServiceInstance instance = loadBalancerClient.choose("spring-cloud-provider");
//		return instance.getHost() + ":" + instance.getPort();
//	}
	
}
