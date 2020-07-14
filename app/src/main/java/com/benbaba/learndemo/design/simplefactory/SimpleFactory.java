package com.benbaba.learndemo.design.simplefactory;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * 简单工厂类选择何合适的类来创建接口Api对象
 * Created by Administrator on 2020/7/14.
 */
public class SimpleFactory {

    private SimpleFactory() {
    }

    public static Api createApi(int condition) {
        if (condition == 1) {
            return new AImp();
        } else {
            return new Bimp();
        }
    }
}
