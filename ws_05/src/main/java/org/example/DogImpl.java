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
