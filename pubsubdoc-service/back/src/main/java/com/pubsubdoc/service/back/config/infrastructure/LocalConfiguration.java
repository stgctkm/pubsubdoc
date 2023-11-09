package com.pubsubdoc.service.back.config.infrastructure;


import com.pubsubdoc.user.service.sdk.api.UserServiceApi;
import com.pubsubdoc.user.service.sdk.api.UserServiceApiApiImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("local")
public class LocalConfiguration {
    @Value("${application.services.user.host}")
    private String userServiceHost;

    @Bean
    public UserServiceApi userService() {
        return new UserServiceApiApiImpl(userServiceHost);
    }
}
