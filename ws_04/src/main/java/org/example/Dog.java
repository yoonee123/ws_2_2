package org.example;

import org.springframework.stereotype.Component;

// @Component: 이 클래스가 스프링의 빈으로 등록될 수 있도록 표시
// 스프링은 이 클래스를 자동으로 스캔하여 관리할 수 있음
// 이 주석이 활성화되면 Dog 객체가 스프링 컨테이너에 빈으로 등록됨
// @Component
public class Dog {
    private String name; // Dog의 이름을 저장하는 속성

    // getName() 메서드는 name 속성의 값을 반환하는 Getter 메서드
    public String getName() {
        return name;
    }

    // setName() 메서드는 name 속성의 값을 설정하는 Setter 메서드
    public void setName(String name) {
        this.name = name;
    }

    // @Override: Object 클래스의 toString() 메서드를 재정의(override)하여
    // 이 클래스의 인스턴스가 출력될 때 객체의 속성을 알기 쉽게 문자열로 반환
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}'; // name 속성을 포함한 문자열 반환
    }

    // 이 클래스는 name 속성과 그에 대한 Getter, Setter, toString() 메서드를 가지고 있는 간단한 클래스
}
