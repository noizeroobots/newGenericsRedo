package ru.tinkoff.fintech.homework;

public class Main {

    public static void main(String[] args) {


        Box<Apple> srcBox = new Box<>();
        srcBox.putFruit(new Apple());
        Box<Object> destBox = new Box<>();
        BoxUtil.copyFromBoxToBox(srcBox, destBox);
        System.out.println(destBox.getFruit());
        //console Apple@2a139a55
    }

}



