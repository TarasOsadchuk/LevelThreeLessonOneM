package com.geekbrains.task_three;

public class Apple extends Fruit {
    private final float weight = 1.0f;

    @Override
    public double getWeight() {
        return weight;
    }

    public String toString() {
        return "apple";
    }
}
