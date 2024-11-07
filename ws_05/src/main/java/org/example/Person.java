package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

// 여러 스프링 어노테이션을 사용하여 해당 클래스를 빈으로 등록합니다.
// 하지만 일반적으로 한 클래스에 여러 역할을 지정하지 않으므로, 필요에 따라 하나의 어노테이션만 사용하는 것이 좋습니다.
// 예: @Service, @Repository, @Controller 등
@Service
@Repository
@Controller
@Component
public class Person {
    // Person의 이름을 저장할 변수
    String name;

    // 동물의 종류를 나타내는 Animal 타입의 변수
    // 주석 처리된 @Qualifier와 @Autowired로 DI를 통해 주입받을 수 있습니다.
    Animal pet;

    // 생성자를 통한 의존성 주입 예시 (주석 처리됨)
    // @Qualifier("DOG")와 @Autowired를 사용하여 "DOG" 빈을 주입받습니다.
    // public Person(@Qualifier("DOG") @Autowired Animal pet) {
    //     this.pet = pet;
    // }

    // 이름을 반환하는 getter 메서드
    public String getName() {
        return name;
    }

    // 이름을 설정하는 setter 메서드
    public void setName(String name) {
        this.name = name;
    }

    // Animal 타입의 pet을 반환하는 getter 메서드
    public Animal getPet() {
        return pet;
    }

    // @Qualifier 어노테이션을 사용하여 "DOG" 빈을 주입받는 setter 메서드
    // 이 메서드가 호출될 때, "DOG"라는 이름으로 등록된 Animal 구현체가 주입됩니다.
    @Qualifier("DOG") // "DOG" 빈을 명시적으로 지정하여 주입
    // 현재 TurtleImpl 파일에 @Primary가 달려있으므로, DOG로 구현체를 지정하지 않았다면
    // "꼬북" 이 출력되었을것
    @Autowired // 스프링이 자동으로 의존성을 주입하도록 지시
    public void set동물(Animal pet) {
        this.pet = pet; // 주입받은 pet을 클래스의 pet 필드에 설정
    }

    // Person 객체의 정보를 출력하는 toString() 메서드
    // 이 메서드는 Person 객체가 문자열로 표현될 때의 형식을 정의합니다.
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", pet=" + pet + // pet은 주입된 Animal 객체의 정보
                '}';
    }
}
