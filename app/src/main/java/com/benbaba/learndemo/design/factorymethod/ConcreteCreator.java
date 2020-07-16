package com.benbaba.learndemo.design.factorymethod;

/**
 * 具体的创建器对象，覆盖实现Creator定义的工厂方法，返回具体的Product实例
 */
public class ConcreteCreator extends Creator {
    @Override
    protected Product factoryMethod() {
        return new ConcreteProduct();
    }

    public void doSomething(){
        System.out.println("doSomething");
    }
}
