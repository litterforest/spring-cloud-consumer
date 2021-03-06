package com.cobee.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.web.client.RestTemplate;

import com.cobee.config.ribbon.RibbonRuleConfig;


@SpringBootApplication
//@EnableEurekaClient
@EnableFeignClients
//@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableCircuitBreaker
//@RibbonClients({@RibbonClient(name = "spring-cloud-provider", configuration = RibbonRuleConfig.class), @RibbonClient(name = "spring-cloud-provider2", configuration = RibbonRuleConfig.class)})
public class SpringCloudConsumerApplication {

//	@Bean
//	@LoadBalanced
//	public RestTemplate createRestTemplate() {
//		return new RestTemplate();
//	}
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringCloudConsumerApplication.class, args);
		
	}
}
