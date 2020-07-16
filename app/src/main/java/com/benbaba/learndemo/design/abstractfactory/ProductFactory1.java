package com.benbaba.learndemo.design.abstractfactory;

/**
 * 具体的产品工厂，通常在具体的工厂里面，会选择具体的产品实现对象，来创建符合
 * 抽象工厂定义的方法返回的产品类型的对象
 */
public class ProductFactory1 implements AbstractFactory {
    @Override
    public AbstractProductA createAbstractProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createAbstractProductB() {
        return new ProductB1();
    }
}
