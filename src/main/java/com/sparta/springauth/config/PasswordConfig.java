package com.sparta.springauth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class PasswordConfig {

  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();

    // PasswordEncoder 라는 인터페이스가
    //BCryptPasswordEncoder라는 구현체를 사용한다.
    // BCrypt 는 Hash 함수이다.
  }
}
