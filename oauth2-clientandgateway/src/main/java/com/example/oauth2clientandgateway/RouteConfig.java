package com.example.oauth2clientandgateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfig {

    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(
                        r -> r.path("/resource/**")
                                .filters(f-> f.rewritePath("/resource/", "/")
                                        .tokenRelay("messaging-client"))

                                .uri("http://localhost:8082")//resource server
                )
                .build();
    }
}
