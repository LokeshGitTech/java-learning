package com.engineeringdigest.corejava.oops.polymorphism;


// Override occurs in between two class which having
public class MethodOverridingClass2 extends  MethodOverridingClass1 {
    void mmm(int a){
        System.out.println("Method overriding class2");
        System.out.println("i have 2 friend");
    }

    public static void main(String[] args) {
        MethodOverridingClass2 aa= new MethodOverridingClass2();
        aa.mmm(5);
    }
}
