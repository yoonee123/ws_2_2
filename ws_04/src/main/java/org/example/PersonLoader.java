package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

// @Configuration: 이 클래스가 스프링의 설정 클래스를 나타냄
// 스프링이 이 클래스를 읽어들여서 빈을 생성하고 관리
@Configuration

// @ComponentScan: 지정된 패키지 내의 @Component가 붙은 클래스를 자동으로 찾아서 빈으로 등록
// 여기서는 'org.example' 패키지를 스캔하여 관련 빈을 등록함
@ComponentScan(basePackages = "org.example")
public class PersonLoader {

    // @Bean: 이 메서드가 리턴하는 객체를 스프링의 빈으로 등록
    // 'dog1'이라는 이름의 빈으로 등록되며, 이 빈은 나중에 다른 빈에서 주입받을 수 있음
    @Bean
    public Dog dog1() {
        Dog dog = new Dog();
        dog.setName("흰둥이"); // 흰둥이라는 이름의 Dog 객체 생성
        return dog; // 빈으로 등록
    }

    // 'dog2'라는 이름의 빈으로 등록
    @Bean
    public Dog dog2() {
        Dog dog = new Dog();
        dog.setName("뽀삐"); // 뽀삐라는 이름의 Dog 객체 생성
        return dog; // 빈으로 등록
    }

    // 'dog3'라는 이름의 빈으로 등록
    @Bean
    public Dog dog3() {
        Dog dog = new Dog();
        dog.setName("마루"); // 마루라는 이름의 Dog 객체 생성
        return dog; // 빈으로 등록
    }

    // 주석 처리된 부분은 빈을 생성하는 코드 예시
    // Person 객체를 생성하고, Dog 객체를 주입하는 방법에 대한 예시
    // Dog 빈을 사용하고 있지 않다는 FIXME 주석이 있어, Dog 빈을 주입하는 방법을 고려해야 함

    // @Bean
    // public Person person1() {
    //     Person person = new Person();
    //     person.setName("홍길동"); // 이름 설정
    //     person.setDog(dog1()); // dog1 빈을 사용하여 Dog 객체 주입
    //     return person; // 빈으로 등록
    // }

    // 주석 처리된 또 다른 방법으로, 메서드 파라미터를 통해 Dog 빈을 주입받는 방법
    // @Bean
    // public Person person1(Dog dog) {
    //     Person person = new Person();
    //     person.setName("홍길동"); // 이름 설정
    //     person.setDog(dog); // 파라미터로 받은 Dog 객체 주입
    //     return person; // 빈으로 등록
    // }
}
