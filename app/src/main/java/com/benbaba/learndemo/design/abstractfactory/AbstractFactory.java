package com.benbaba.learndemo.design.abstractfactory;

/**
 * 抽象的工厂,定义创建一系列产品对象的接口
 */
public interface AbstractFactory {
    /**
     * 创建抽象的产品A
     * @return
     */
    public AbstractProductA createAbstractProductA();
    /**
     * 创建抽象的产品B
     * @return
     */
    public AbstractProductB createAbstractProductB();
}
