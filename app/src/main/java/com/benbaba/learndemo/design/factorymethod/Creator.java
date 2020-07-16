package com.benbaba.learndemo.design.factorymethod;

/**
 * 创建器声明工厂方法，工厂方法通常会返回Product类型的实例对象，而且多是抽象方法
 * 也可以Creator里面提供工厂方法的默认实现，让工厂方法返回一个缺省的Product类型的实例对象
 */
public abstract class Creator {
    protected abstract Product factoryMethod();
}
