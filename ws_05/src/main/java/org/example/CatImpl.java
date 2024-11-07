package org.example;

import org.springframework.stereotype.Component;

@Component
public class CatImpl implements Animal{

    String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void bark() {
        System.out.println("야옹");
    }

    @Override
    public String toString() {
        return "CatImpl{" +
                "name='" + name + '\'' +
                '}';
    }
}
