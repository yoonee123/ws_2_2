package com.seoyoon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        System.out.println("MAIN START");

        // 1. 스프링 컨텍스트 생성: PersonLoader 설정을 기반으로 애플리케이션 컨텍스트 초기화
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PersonLoader.class);

        // 2. 수동으로 등록할 Person 객체 생성 및 설정
        Person regPerson = new Person();
        regPerson.setName("수동자"); // 이름을 "수동자"로 설정
        regPerson.setAge(10);       // 나이를 10으로 설정

        // 3. context.registerBean 메서드를 이용해 수동으로 빈 등록
        // - "reg"라는 이름으로 Person 타입의 빈을 등록
        // - Supplier 인터페이스를 사용해 regPerson 객체를 반환하는 방식으로 설정
        context.registerBean("reg", Person.class, new Supplier<Person>() {
            @Override
            public Person get() {
                return regPerson; // 미리 정의한 regPerson 객체를 빈으로 사용
            }
        });

        // 4. 컨텍스트에서 "person"이라는 이름으로 빈을 가져와 person1에 할당
        // - person1 객체의 이름과 나이를 설정
        Person person1 = context.getBean("person", Person.class);
        person1.setName("홍길동");  // 이름을 "홍길동"으로 설정
        person1.setAge(20);         // 나이를 20으로 설정
        System.out.println("person1 : " +person1); // person1의 정보를 출력
        System.out.println("이름 : " + person1.getName() + " 나이 : " + person1.getAge());

        // 5. context에서 "reg"라는 이름으로 등록된 수동 빈을 가져와 person2에 할당
        Person person2 = context.getBean("reg", Person.class);
        System.out.println("person2 : " +person2); // person2의 정보를 출력
        System.out.println("이름 : " + person2.getName() + " 나이 : " + person2.getAge());
    }
}
// 요약
// - 런타임 시 `registerBean` 메서드를 이용해 수동으로 빈을 등록할 수 있음
// - @Configuration에 정의된 기본 빈과 함께 직접 정의한 객체를 빈으로 관리 가능
