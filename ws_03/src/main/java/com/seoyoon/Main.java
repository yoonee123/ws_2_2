package com.seoyoon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        System.out.println("MAIN START");

        // 1. 직접 객체 생성
        // 스프링 컨테이너를 사용하지 않고 직접 Person 객체를 생성하고 초기화
        Person person1 = new Person();
        person1.setName("정서윤");
        person1.setAge(24);

        System.out.println("person1 : " + person1);
        System.out.println("이름 : " + person1.getName() + " 나이 : " + person1.getAge());

        // 2. 스프링 컨텍스트를 이용한 빈 조회
        // ApplicationContext는 스프링 컨테이너의 인터페이스로, Bean을 관리하고 제공하는 역할을 함
        ApplicationContext context = new AnnotationConfigApplicationContext(PersonLoader.class);

        // 컨테이너를 사용하여 빈을 등록하고, 설정 클래스에서 @Configuration과 @Bean을 통해 관리
        // PersonLoader 클래스가 스프링 빈 등록에 대한 설정을 제공하고 있음

        // 3. 빈 이름을 사용하여 스프링 컨테이너에서 Person 객체 가져오기
        // getBean("빈 이름", 타입)으로 특정 이름의 빈을 조회할 수 있음
        Person newOne = context.getBean("Hong", Person.class);
        System.out.println("newOne : " + newOne);
        System.out.println("이름 : " + newOne.getName() + " 나이 : " + newOne.getAge());

        // 추가 빈 조회
        Person newOne2 = context.getBean("Lee", Person.class);
        System.out.println("newOne2 : " + newOne2);
        System.out.println("이름 : " + newOne2.getName() + " 나이 : " + newOne2.getAge());

        Person newOne3 = context.getBean("Super", Person.class);
        System.out.println("newOne3 : " + newOne3);
        System.out.println("이름 : " + newOne3.getName() + " 나이 : " + newOne3.getAge());
    }

    // 코드 요약
    // 1) 스프링 컨테이너를 통한 객체 생성 및 관리 방식을 이해
    // 2) @Configuration과 @Bean을 사용한 빈 등록과 컨테이너의 역할 이해
    // 3) 직접 객체를 생성하는 방식과 스프링 컨테이너를 사용하는 방식의 차이점 파악
    // 4) IoC(제어의 역전)와 DI(의존성 주입)의 개념을 바탕으로 스프링이 객체 관리를 통해 제공하는 이점 확인
}
