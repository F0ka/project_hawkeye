package com.hawkeye.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.hawkeye")
@EntityScan("com.hawkeye.domain")
@EnableJpaRepositories("com.hawkeye.repository")
public class HawkeyeApplication {
    public static void main(String[] args) {
        SpringApplication.run(HawkeyeApplication.class, args);
    }
}