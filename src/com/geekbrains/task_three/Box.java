package com.geekbrains.task_three;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    final ArrayList<T> fruitBox;
    Class fruitClass;

    public Box() {
        this.fruitBox = new ArrayList<>();
    }

    public void add(T fruit) {
        if (fruitClass == null) {
            fruitBox.add(fruit);
            fruitClass = fruit.getClass();
        } else if (fruitClass.equals(fruit.getClass())) {
            fruitBox.add(fruit);
        } else {
            throw new RuntimeException("В коробку нельзя складывать разные виды фруктов");
        }

    }

    public double getWeight() {
        double weight = 0;
        for (T fruit : fruitBox) {
            weight = weight + fruit.getWeight();
        }
        return weight;
    }

    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }

    public void transfer(Box<T> newBox) {
        for (T fruit : this.fruitBox) {
            newBox.add(fruit);
        }
        this.fruitBox.clear();
    }
}
