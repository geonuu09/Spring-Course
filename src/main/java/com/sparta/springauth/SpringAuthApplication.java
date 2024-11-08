package com.sparta.springauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//@SpringBootApplication(exclude = SecurityAutoConfiguration.class) // spring security 인증 기능 제외
@SpringBootApplication
public class SpringAuthApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringAuthApplication.class, args);
  }

}
