package com.gdu.app01.xml02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  // IocContainer에 bean을 등록하는 클래스이다.
public class User {

  // 메소드를 bean으로 등록하기 위해서 @Bean을 추가한다.
  
  @Bean
  public Calculator calc() {  // 메소드이름 == bean이름
    return new Calculator();
  }
  
  @Bean
  public User man() {
    User person = new User();
    person.setName("뽀로로");
    person.setAge(20);
    person.setCalculator(calc());
    return person;
  }
  
  @Bean
  public User woman() {
    return new User("루피", 20, calc());
  }
  
}