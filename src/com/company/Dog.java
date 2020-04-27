package com.company;

import javax.xml.namespace.QName;

public class Dog extends Animal {
    private static int colDogs = 0;
    private String name;
    private int swimDistance;
    private int runDistance;
    private double jumpHeight;


    public Dog(String name) {
        super();
        colDogs++;
        this.name = name;
        this.swimDistance = 10;
        this.runDistance = 200;
        this.jumpHeight = 0.500001;

    }

    @Override
    public void swim(int distance) {
        if (distance <= swimDistance) {
            System.out.println("Dog " + name + " swims: " + true);
        } else {
            System.out.println("Dog " + name + " swims: " + false);
        }
    }

    @Override
    public void jump(double height) {
        if (height <= this.jumpHeight) {
            System.out.println("Dog " + name + " jumps: " + true);
        } else {
            System.out.println("Dog " + name + " jumps: " + false);
        }

    }

    @Override
    public void run(int distance) {
        if (distance <= runDistance) {
            System.out.println("Dog " + name + " runs: " + true);
        } else {
            System.out.println("Dog " + name + " runs: " + false);
        }

    }

    public static int getDogs() {
        return colDogs;
    }

    public void setSwimDistance(int swimDistance) {
        this.swimDistance = swimDistance;
    }

    public void setRunDistance(int runDistance) {
        this.runDistance = runDistance;
    }

    public void setJumpHeight(double jumpHeight) {
        this.jumpHeight = jumpHeight;
    }
}
