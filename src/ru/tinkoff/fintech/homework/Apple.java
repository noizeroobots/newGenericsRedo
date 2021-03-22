package ru.tinkoff.fintech.homework;

public class Apple<T extends Fruit> extends Fruit {

    
    private T apple;

    public T getIfFresh() {
        if (apple != null && apple.isFresh()) {
            return apple;
        } else {
            return null;
        }
    }

    public T get() {
        return apple;
    }

    public void put(T element) {
        this.apple = element;

    }
}