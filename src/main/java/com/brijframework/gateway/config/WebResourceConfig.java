package com.brijframework.gateway.config;

import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class WebResourceConfig {
	
	@Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
    	return new RestTemplate();
    }
    
    @Bean
    public DiscoveryClientRouteDefinitionLocator 
      discoveryClientRouteLocator(ReactiveDiscoveryClient discoveryClient,
  			DiscoveryLocatorProperties properties) {
 
        return new DiscoveryClientRouteDefinitionLocator(discoveryClient,properties);
    }

}
