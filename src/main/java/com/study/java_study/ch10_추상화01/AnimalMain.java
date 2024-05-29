package com.study.java_study.ch10_추상화01;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog("콩이", 11, "말티즈");
        Animal tiger = new Tiger("옹이", 5, 100);

        dog.move();
        // 부모클래스의 메서드를 재정의 하고 업캐스팅 해도 재정의된 메서드로 실행됨
        tiger.move();
        ((Tiger) tiger).hunt();
        dog.bark();

        System.out.println();

        Animal[] animals = new Animal[3];
        animals[0] = new Animal("이름없는 동물", 10);
        animals[1] = new Dog("콩이", 11, "말티즈");
        animals[2] = new Tiger("옹이", 5, 100);

        for(Animal animal : animals) {
            animal.move();
        }

        for(Animal animal : animals) {
            if(animal.getClass() == Tiger.class) {
                Tiger t = (Tiger) animal;
                t.hunt();
            } else if (animal.getClass() == Dog.class) {
                Dog d = (Dog) animal;
                d.bark();
            }

        }

    }
}