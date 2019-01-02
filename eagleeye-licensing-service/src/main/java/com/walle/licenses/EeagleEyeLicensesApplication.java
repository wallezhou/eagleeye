package com.walle.licenses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class EeagleEyeLicensesApplication {

    public static void main(String[] args) {
        SpringApplication.run(EeagleEyeLicensesApplication.class, args);
    }
}
