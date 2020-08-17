package com.dimaidt.springbootkeycloak.webdemo.config;

import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Alex Hu
 */
@Configuration
public class KeycloakConfig {

    /**
     * 定义springboot配置keycloak,而不是使用默认的keycloak.json配置文件
     * @return
     */
    @Bean
    public KeycloakSpringBootConfigResolver keycloakConfigResolver() {
        return new KeycloakSpringBootConfigResolver();
    }
}
