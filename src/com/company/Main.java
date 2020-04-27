package com.company;

import static com.company.Dog.getDogs;

public class Main {

    public static void main(String[] args) {
        Animal[] animal = {
                new Cat("Мурзик"),
                new Dog("Белый Бим"),
                new Cat("Матильда"),
                new Dog("Гром"),
                new Dog("Джек"),
                new Cat("Муська"),
                new Dog("Наполеон")
        };
        for (int i = 0; i <= animal.length - 1; i++) {
            if (animal[i] instanceof Cat) {
                ((Cat) animal[i]).setRunDistance(0);
                ((Cat) animal[i]).setJumpHeight(50);
                ((Cat) animal[i]).setSwimDistance(0);
            }
            if (animal[i] instanceof Dog) {
                ((Dog) animal[i]).setRunDistance(800);
                ((Dog) animal[i]).setJumpHeight(4);
                ((Dog) animal[i]).setSwimDistance(3);

            }
            animal[i].jump(1);
            animal[i].swim(100);
            animal[i].run(50);
        }
        System.out.println();
        System.out.println("Котов " + Cat.getCats() + ", Собак " + getDogs());


    }
}
