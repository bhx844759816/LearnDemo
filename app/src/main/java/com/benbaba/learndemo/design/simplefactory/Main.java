package com.benbaba.learndemo.design.simplefactory;

/**
 * Created by Administrator on 2020/7/14.
 */
public class Main {
    public static void main(String[] args) {
        Api api = SimpleFactory.createApi(1);
        api.operation("操作实现类A");
    }
}
