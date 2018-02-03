package com.cobee.config.ribbon;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.BestAvailableRule;
import com.netflix.loadbalancer.IRule;

@Configuration
public class RibbonRuleConfig {
	
	@Bean
	public IRule ribbonRule() {
		return new BestAvailableRule();
	}
	
}
