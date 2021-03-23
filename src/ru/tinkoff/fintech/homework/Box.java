package ru.tinkoff.fintech.homework;

public class Box<T> {

    protected Fruit fruit;
    protected T box;

    public final Fruit getIfFresh() {
        if (fruit != null && fruit.isFresh()) {
            return fruit;
        } else {
            return null;
        }
    }

    public final Fruit getFruit() {
        return fruit;
    }

    public final void putFruit(final Fruit fruit) {
        this.fruit = fruit;
    }

    public final T getBox() {
        return box;
    }

}
