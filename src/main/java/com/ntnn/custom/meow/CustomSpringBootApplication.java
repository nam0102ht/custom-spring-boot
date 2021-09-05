package com.ntnn.custom.meow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class CustomSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomSpringBootApplication.class, args);
    }

}
