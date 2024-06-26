package com.study.java_study.ch19_익명클래스;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class AbstractCar {

    private String model;
    private String color;

    public abstract void createCar();
    public abstract void showCar();
}
