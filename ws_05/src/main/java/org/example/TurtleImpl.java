package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class TurtleImpl implements Animal{

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
        System.out.println("꼬북");
    }

    @Override
    public String toString() {
        return "TurtleImpl{" +
                "name='" + name + '\'' +
                '}';
    }
}
