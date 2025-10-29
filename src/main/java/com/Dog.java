package com;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.printf("Dog %s is running%n", name);
    }
}
