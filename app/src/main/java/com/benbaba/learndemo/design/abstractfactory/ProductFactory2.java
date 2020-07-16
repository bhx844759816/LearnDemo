package com.benbaba.learndemo.design.abstractfactory;

public class ProductBFactory implements AbstractFactory {
    @Override
    public AbstractProductA createAbstractProductA() {
        return new ProductA();
    }

    @Override
    public AbstractProductB createAbstractProductB() {
        return new ProductB();
    }
}
