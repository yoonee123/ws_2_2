package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// @Primary 어노테이션은 이 빈이 같은 타입의 다른 빈이 있을 경우 기본적으로 선택되는 빈임을 나타냄
@Primary
// 스프링의 빈으로 등록하기 위한 @Component 어노테이션
@Component
public class TurtleImpl implements Animal {

    // Turtle의 이름을 저장할 변수
    String name;

    // 이름을 설정하는 setter 메서드
    public void setName(String name) {
        this.name = name;
    }

    // Animal 인터페이스의 getName 메서드 구현
    // 현재는 이름을 반환하지 않고 null을 반환하고 있음
    @Override
    public String getName() {
        return null; // 구현이 필요함
    }

    // Animal 인터페이스의 bark 메서드 구현
    // "꼬북"이라는 소리를 출력하는 메서드
    @Override
    public void bark() {
        System.out.println("꼬북");
    }

    // TurtleImpl 객체의 정보를 출력하는 toString() 메서드
    @Override
    public String toString() {
        return "TurtleImpl{" +
                "name='" + name + '\'' +
                '}'; // name 속성을 포함한 문자열 반환
    }
}
