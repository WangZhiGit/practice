package com.example.practice.learn.设计模式.适配器模式_类的适配器.test;

import com.example.practice.learn.设计模式.适配器模式_类的适配器.Adapter;
import com.example.practice.learn.设计模式.适配器模式_类的适配器.Targetable;

public class AdapterTest {
    public static void main(String[] args) {
        Targetable targetable = new Adapter();
        targetable.method1();
        targetable.method2();
    }
}
