package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;

    // 필드 주입: dog3라는 이름의 Dog 빈을 자동으로 주입
    // @Autowired: Spring이 이 필드에 의존성을 자동으로 주입하도록 지시
    @Qualifier("dog3") // dog3 빈이 주입될 것
    @Autowired
    private Dog dog;

//    @Autowired
//    public Person(Dog dog) {
//        this.dog = dog;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    // Setter 주입: setDog 메서드를 통해 의존성 주입
    // @Qualifier("dog1")로 dog1 빈을 주입하도록 명시
    // 필드 주입과는 달리, 메서드 주입은 호출 시점에 주입이 이루어짐
    @Qualifier("dog1") // dog1 빈이 주입될 것
    @Autowired
    public void setDog(Dog dog) {
        this.dog = dog; // dog 필드에 dog1 빈이 할당됨
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dog=" + dog +
                '}';
    }
}
