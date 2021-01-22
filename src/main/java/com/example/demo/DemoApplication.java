package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@SpringBootApplication
@Slf4j
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RestController
    public static class Controller {
        @GetMapping("/endpointA")
        public String testRandomA() throws InterruptedException {
            if (Integer.valueOf(3).equals(new Random().nextInt(5)))
                throw new RuntimeException("Random Error");

            if (Integer.valueOf(2).equals(new Random().nextInt(5)))
                Thread.sleep(300);

            return "success";
        }

        @GetMapping("/endpointB")
        public String testRandomB() throws InterruptedException {
            if (Integer.valueOf(3).equals(new Random().nextInt(5)))
                throw new RuntimeException("Random Error");

            if (Integer.valueOf(2).equals(new Random().nextInt(5)))
                Thread.sleep(300);

            return "success";
        }

        @GetMapping("/endpointC")
        public String testRandom3() throws InterruptedException {
            if (Integer.valueOf(3).equals(new Random().nextInt(5)))
                throw new RuntimeException("Random Error");

            if (Integer.valueOf(2).equals(new Random().nextInt(5)))
                Thread.sleep(300);

            return "success";
        }
    }

}
