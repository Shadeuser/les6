package com.company;

public class Cat extends Animal {
    private static int colCats = 0;
    private String name;
    private int swimDistance;
    private int runDistance;
    private double jumpHeight;

    public Cat(String name) {
        super();
        colCats++;
        this.name = name;
        this.swimDistance = 0;
        this.runDistance = 200;
        this.jumpHeight = 2.0;

    }

    @Override
    public void run(int distance) {
        if (distance <= runDistance) {
            System.out.println("Cat " + name + " runs: " + true);
        } else {
            System.out.println("Cat " + name + " runs: " + false);
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= swimDistance) {
            System.out.println("Cat " + name + " swims: " + true);
        }
        System.out.println("Cat " + name + " swims: " + false);
    }

    @Override
    public void jump(double height) {
        if (height <= jumpHeight) {
            System.out.println("Cat " + name + " jumps: " + true);
        } else {
            System.out.println("Cat " + name + " jumps: " + false);
        }

    }

    public static int getCats() {
        return colCats;
    }

    public static void setColCats(int colCats) {
        Cat.colCats = colCats;
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
