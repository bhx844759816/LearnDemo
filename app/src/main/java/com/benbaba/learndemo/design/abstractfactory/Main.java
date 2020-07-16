package com.benbaba.learndemo.design.abstractfactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory1 = new ProductFactory1();
        factory1.createAbstractProductA();
        factory1.createAbstractProductB();
    }
}
