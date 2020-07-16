package com.benbaba.learndemo.design.abstractfactory;

public class ProductAFactory implements AbstractFactory {
    @Override
    public AbstractProductA createAbstractProductA() {
        return new ProductA();
    }

    @Override
    public AbstractProductB createAbstractProductB() {
        return new ProductB();
    }
}
