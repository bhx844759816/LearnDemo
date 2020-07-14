package com.benbaba.learndemo.design.simplefactory;

/**
 * 接口的具体实现B
 * Created by Administrator on 2020/7/14.
 */
public class Bimp implements Api {
    @Override
    public void operation(String action) {
        System.out.println("action = " + action);
    }
}
