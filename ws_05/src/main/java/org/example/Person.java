package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Service
@Repository
@Controller

@Component
public class Person {
    String name;

//    @Qualifier("DOG")
//    @Autowired
    Animal pet;

//    public Person(@Qualifier("DOG") @Autowired Animal pet) {
//        this.pet = pet;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal getPet() {
        return pet;
    }

    @Qualifier("DOG")
    @Autowired
    public void set동물(Animal pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", pet=" + pet +
                '}';
    }
}
