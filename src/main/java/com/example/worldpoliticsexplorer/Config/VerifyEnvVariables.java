package com.example.worldpoliticsexplorer.Config;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;


@Configuration
public class VerifyEnvVariables {

    @Value("${SPRING_DATASOURCE_URL}")
    private String datasourceUrl;

    @Value("${SPRING_DATASOURCE_USERNAME}")
    private String datasourceUsername;

    @Value("${SPRING_DATASOURCE_PASSWORD}")
    private String datasourcePassword;

    @Value("${SPRING_MAIL_HOST}")
    private String mailHost;

    @Value("${SPRING_MAIL_PORT}")
    private String mailPort;

    @Value("${SPRING_MAIL_USERNAME}")
    private String mailUsername;

    @Value("${SPRING_MAIL_PASSWORD}")
    private String mailPassword;

    @PostConstruct
    public void printEnvVariables() {
        System.out.println("SPRING_DATASOURCE_URL: " + datasourceUrl);
        System.out.println("SPRING_DATASOURCE_USERNAME: " + datasourceUsername);
        System.out.println("SPRING_DATASOURCE_PASSWORD: " + datasourcePassword);
        System.out.println("SPRING_MAIL_HOST: " + mailHost);
        System.out.println("SPRING_MAIL_PORT: " + mailPort);
        System.out.println("SPRING_MAIL_USERNAME: " + mailUsername);
        System.out.println("SPRING_MAIL_PASSWORD: " + mailPassword);
    }
}
