package com.jap;

public class AddDemo {

    public void add(int num1, int num2, int num3) {
        System.out.println(num1+num2 + num3);
    }
    public void add(float num1, float num2) {
        System.out.println(num1+num2);
    }
    public void add(int num1, int num2) {
        System.out.println(num1+num2);

    }
    public static void main(String[] args) {
        AddDemo addDemo = new AddDemo();
        addDemo.add(10, 12);
        addDemo.add(12, 23, 34);
        addDemo.add(12.5f, 4.5f);

    }
}
