package ru.tinkoff.fintech.homework;

public class Main {

    public static void main(String[] args) {


            Box<Apple> src = new Box<>();
            src.setFruit(new Apple());
            Box<Object> dest = new Box<>();
            BoxUtil.copyFromBoxToBox(src, dest);

            System.out.println(dest.getFruit();
            //console Apple@2a139a55
        }

        }



