package ru.tinkoff.fintech.homework;

public class BoxUtil {

    public static void copyFromBoxToBox(final Box<? extends Apple> src, final Box<Object> dest) {
        dest.putFruit(src.getFruit());

    }

    public static void copyFreshFruitFromBoxToBox(final Box<? extends Fruit> src, final Box<Object> dest) {
        dest.putFruit(src.getIfFresh());
    }

    public static void printElementFromTwoBoxes(final Box box) {
        System.out.println(((Box) box.getBox()).getBox());
    }
}

