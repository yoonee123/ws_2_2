package com.seoyoon;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
// 이 클래스는 스프링 컨테이너가 사용할 설정 클래스임을 의미
// IoC 개념에 따라 객체의 생성과 주입을 스프링이 담당
public class PersonLoader {

    //@Primary
    @Bean(name = "Hong")
    // 1. 빈을 통해 Person 객체를 이름 "Hong"으로 컨테이너에 등록 -> Main에서 조회 가능
    public Person person1() {
        // Person 객체 생성 및 속성 설정
        Person newOne = new Person();
        newOne.setName("홍길동");
        newOne.setAge(345);

        return newOne;  // 생성된 객체를 빈으로 컨테이너에 반환
    }

    @Bean(name = "Lee")
    // 2. 동일한 방식으로 "Lee" 이름의 Person 빈 생성 및 등록
    public Person person2() {
        Person newOne = new Person();
        newOne.setName("이순신");
        newOne.setAge(40);

        return newOne;
    }

    @Bean(name = "Super")
    // 3. 또 다른 Person 객체를 "Super"라는 이름으로 빈에 등록
    public Person person3() {
        Person newOne = new Person();
        newOne.setName("슈퍼맨");
        newOne.setAge(2000);

        return newOne;
    }

    // 코드 요약
    // 1) @Bean 어노테이션을 통해 메서드가 반환하는 객체를 스프링 컨테이너에 등록
    // 2) @Bean(name="빈이름")을 통해 이름으로 특정 객체를 식별 가능
    // 3) 여러 개의 빈을 등록하여 Main 클래스에서 각각의 객체를 다르게 조회 가능
    // 4) 필요시 @Primary를 이용해 기본 빈을 지정할 수 있음 (여기서는 주석처리됨)
}
