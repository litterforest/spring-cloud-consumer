package com.cobee.demo.feign;

import org.springframework.stereotype.Component;

@Component
public class ProviderFeignClientFallback implements ProviderFeignClient {

	@Override
	public String hello() {
		return "hello fallback";
	}

}
