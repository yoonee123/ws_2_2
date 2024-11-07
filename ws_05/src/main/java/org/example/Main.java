package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("MAIN START");

        // AnnotationConfigApplicationContext를 사용하여 스프링 컨텍스트를 초기화합니다.
        // BeanConf.class는 @Configuration 애노테이션이 붙은 클래스로, 빈 설정을 포함하고 있습니다.
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConf.class);

        // Person 클래스를 빈으로 가져옵니다.
        // 이때 BeanConf에서 정의한 빈이 반환됩니다.
        Person person1 = context.getBean(Person.class);

        // Person 객체의 정보를 출력합니다.
        // 이때 name 속성과 pet 속성이 출력됩니다.
        System.out.println(person1);

        // Person 객체의 pet(Animal 인터페이스 구현체)의 bark() 메서드를 호출하여 동물의 소리를 출력합니다.
        person1.getPet().bark();
    }
}
