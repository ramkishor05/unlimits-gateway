package com.brijframework.gateway.filter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ServerWebExchange;

import com.brijframework.gateway.dto.UserDetailResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import reactor.core.publisher.Mono;

@Component
public class GlobalRequestFilter implements GlobalFilter, Ordered {
	
	private final static String USER_ENDPOINT="http://localhost:2222/api/user";
	
	@Autowired
	private RestTemplate restTemplate;

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest request = exchange.getRequest();
        List<String> list = request.getHeaders().get("Authorization");
        if(!CollectionUtils.isEmpty(list)) {
        	Map<String, Object> uriVariables=new HashMap<String, Object>();
        	uriVariables.put("api_token", list.get(0));
        	/*UserDetailResponse forObject = restTemplate.getForObject(USER_ENDPOINT, UserDetailResponse.class, uriVariables);
            ObjectMapper mapper=new ObjectMapper();
            try {
				System.out.println(mapper.writeValueAsString(forObject));
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
        }
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return -2;
    }
}