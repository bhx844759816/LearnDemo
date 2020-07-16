package com.benbaba.learndemo.design.factorymethod;

public class main {

    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        creator.factoryMethod();
    }
}
