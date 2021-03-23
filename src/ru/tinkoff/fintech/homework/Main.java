package ru.tinkoff.fintech.homework;

public class Main {

    public static void main(final String[] args) {

        Box<Apple> srcBox = new Box<>();
        Box<Object> destBox = new Box<>();
        Apple apple = new Apple();

//checking method1
        srcBox.putFruit(new Apple());
        BoxUtil.copyFromBoxToBox(srcBox, destBox);
        System.out.println(destBox.getFruit());
        //console Apple@7c30a502

//checking method 2.1
        BoxUtil.copyFreshFruitFromBoxToBox(srcBox, destBox);
        System.out.println(destBox.getFruit());
        //console Apple@7c30a502

//checking method 2.2
        apple.setFresh(false);
        srcBox.putFruit(apple);
        BoxUtil.copyFreshFruitFromBoxToBox(srcBox, destBox);
        System.out.println(destBox.getFruit());
        //console null

//checking method 2.3
        BoxUtil.copyFreshFruitFromBoxToBox(srcBox, destBox);
        System.out.println(destBox.getFruit());
        //console null

//checking method 3.1





    }

}



