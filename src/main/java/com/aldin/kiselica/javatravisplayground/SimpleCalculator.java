package com.aldin.kiselica.javatravisplayground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
        System.out.println("Hello world?");
    }

}
