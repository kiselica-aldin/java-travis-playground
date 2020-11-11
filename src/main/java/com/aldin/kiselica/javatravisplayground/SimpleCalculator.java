package com.aldin.kiselica.javatravisplayground;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SimpleCalculator {

    public int add(int a, int b) {
        return a + b;
    }
    public int sub(int a, int b) {
        return a - b;
    }
    public int mul(int a, int b) {
        return a * b;
    }
    public int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        SpringApplication.run(SimpleCalculator.class, args);
        log.info("Hello world!");

        SimpleCalculator simpleCalculator = new SimpleCalculator();
        log.info(String.valueOf(simpleCalculator.add(1,1)));
        log.info(String.valueOf(simpleCalculator.sub(1,1)));
        log.info(String.valueOf(simpleCalculator.mul(4,5)));
        log.info(String.valueOf(simpleCalculator.div(10,5)));
    }
}
