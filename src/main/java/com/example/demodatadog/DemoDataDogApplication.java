package com.example.demodatadog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.metrics.export.datadog.EnableDatadogMetrics;

@SpringBootApplication
@EnableDatadogMetrics
public class DemoDataDogApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoDataDogApplication.class, args);
    }

}
