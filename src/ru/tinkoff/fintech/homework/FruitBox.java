package ru.tinkoff.fintech.homework;

public class FruitBox<T extends Fruit> extends Box<T>{
    public Fruit getIfFresh() {
        if (fruit != null && fruit.isFresh()) {
            return fruit;
        } else {
            return null;
        }
    }
}
