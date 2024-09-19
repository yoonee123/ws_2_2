package com.seoyoon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

public class Main {

    public static void main(String[] args) {
        System.out.println("MAIN START");

        Person person1 = new Person();
        person1.setName("정서윤");
        person1.setAge(24);

        System.out.println("person1 : " +person1);
        System.out.println("이름 : " + person1.getName() + " 나이 : " + person1.getAge());

        // 컨텍스트를 이용한 객체 조회
        ApplicationContext context  = new AnnotationConfigApplicationContext(PersonLoader.class);
        Person newOne = context.getBean("Hong", Person.class);

        System.out.println("newOne : " +newOne);
        System.out.println("이름 : " + newOne.getName() + " 나이 : " + newOne.getAge());

        Person newOne2 = context.getBean("Lee", Person.class);
        System.out.println("newOne2 : " +newOne2);
        System.out.println("이름 : " + newOne2.getName() + " 나이 : " + newOne2.getAge());

        Person newOne3 = context.getBean("Super", Person.class);
        System.out.println("newOne3 : " +newOne3);
        System.out.println("이름 : " + newOne3.getName() + " 나이 : " + newOne3.getAge());
    }

}
