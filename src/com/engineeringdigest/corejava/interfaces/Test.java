package com.engineeringdigest.corejava.interfaces;

public class Test {
    public static void main(String[] args) {
        Dogs dd= new Dogs();
        dd.eat();

        Cat cc= new Cat();
        cc.sleep();

        System.out.println(Dogs.MAX_AGE);

        System.out.println(Animal.MAX_AGE);

        Animal.service();

        dd.start();
    }
}
