package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("MAIN START");

        // 아래의 두 줄은 주석 처리된 코드로,
        // 수동으로 Person과 Dog 객체를 생성하여 출력하는 예시입니다.
        // 이 경우 스프링의 IoC (Inversion of Control)와 DI (Dependency Injection) 기능을 사용하지 않으므로 주석 처리되어 있습니다.
        // Person person = new Person(); // Person 객체를 직접 생성
        // System.out.println(person); // 생성된 Person 객체를 출력

        // Dog dog = new Dog(); // Dog 객체를 직접 생성
        // System.out.println(dog); // 생성된 Dog 객체를 출력

        System.out.println("------------------------------");

        // AnnotationConfigApplicationContext를 사용하여 스프링 컨텍스트를 초기화합니다.
        // PersonLoader.class는 @Configuration 애노테이션이 붙은 클래스로,
        // 여기서 빈을 정의하여 스프링이 관리하게 됩니다.
        ApplicationContext context = new AnnotationConfigApplicationContext(PersonLoader.class);

        // Person 클래스를 빈으로 가져옵니다.
        // 이때 PersonLoader에서 정의한 빈이 반환됩니다.
        Person person1 = context.getBean(Person.class);

        // Person 객체의 이름을 설정합니다.
        person1.setName("홍길동");

        // 주석 처리된 부분은 Dog 객체를 Person 객체에 주입하고,
        // Dog의 이름을 설정하려는 코드입니다.
        // 주석 처리된 이유는 아마도 Dog 빈을 따로 주입받지 않으려는 의도로 보입니다.
        // person1.getDog().setName("흰둥이"); // Dog 객체의 이름을 설정

        // Person 객체를 출력합니다. 이때 name 속성이 설정된 "홍길동"이 출력됩니다.
        System.out.println(person1);

        // Dog 객체를 주입받아 출력하려는 코드입니다.
        // 이 부분도 주석 처리되어 있어 Dog 객체를 직접 가져오지 않고 있습니다.
        // Dog dog1 = context.getBean(Dog.class); // Dog 빈을 가져옴
        // System.out.println(dog1); // 가져온 Dog 객체를 출력
    }
}
