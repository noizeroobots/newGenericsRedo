package ru.tinkoff.fintech.homework;

public class Box<T> {

    protected Fruit fruit;

    public Fruit getIfFresh() {
        if (fruit != null && fruit.isFresh()) {
            return fruit;
        } else {
            return null;
        }
    }
    public Fruit getFruit() {
        return fruit;
    }

    public void putFruit(Fruit fruit) {
        this.fruit = fruit;
    }

}
