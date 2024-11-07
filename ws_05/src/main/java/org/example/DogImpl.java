package org.example;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Qualifier("DOG")
@Component
public class DogImpl implements Animal{

    String name;

    @PostConstruct
    // 빈의 초기화 단계에서 실행할 작업을 지정하기 위해 사용
    private void init() {
        this.name = "흰둥이";
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void bark() {
        System.out.println("멍멍");
    }

    @Override
    public String toString() {
        return "DogImpl{" +
                "name='" + name + '\'' +
                '}';
    }
}
