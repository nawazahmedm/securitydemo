package com.javalearnings.securitydemo.configs;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "file")
@Setter
@Getter
public class FileStorageProperties {

    private String uploadDir;

}