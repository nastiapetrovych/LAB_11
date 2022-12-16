package org.example.task2;

import lombok.Getter;
import lombok.Setter;

public class Client {
    private static int counter = 0;
    @Setter @Getter
    private String name;
    @Setter @Getter
    private String email;
    @Setter @Getter
    private Gender gender;
    @Getter
    private static int id;
    @Setter @Getter
    private static int age;

    public Client(String name, Gender gender, int age){
        id = ++counter;
        this.gender = gender;
        this.name = name;
        this.age = age;
    }
}
