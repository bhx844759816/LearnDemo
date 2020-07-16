package com.benbaba.learndemo.design.abstractfactory;

public class ProductFactory2 implements AbstractFactory {
    @Override
    public AbstractProductA createAbstractProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createAbstractProductB() {
        return new ProductB2();
    }
}
