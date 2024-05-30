package com.study.java_study.ch14_Object;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data  // Getter, Setter, EqualsAndHashCode, ToString 다 만들어줌
public class Teacher {
    private String name;
    private int age;
}