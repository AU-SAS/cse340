package com;

import java.util.Objects;

public class Animal {

    protected final String name;

    public Animal(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Animal is running");
    }

    public String getName() {
        return name;
    }

    public String getFancyName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    public String toString() {
        return name;
    }

}
