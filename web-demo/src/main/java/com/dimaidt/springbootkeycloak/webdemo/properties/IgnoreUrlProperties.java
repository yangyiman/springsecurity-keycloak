package com.dimaidt.springbootkeycloak.webdemo.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@ConfigurationProperties(prefix = "spring.security.ignore")
@Data
public class IgnoreUrlProperties {
    String[] urls;
}
