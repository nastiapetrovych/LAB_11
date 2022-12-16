package org.example;

import lombok.Builder;
import lombok.Singular;
import lombok.ToString;

import java.util.List;

enum Gender{
    MALE, FEMALE
}
@Builder @ToString
public class User {
    private String name;
    private int age;
    private Gender gender;
    private Long height;
    private Long weight;
    @Singular
    private List<String> occupations;
}
