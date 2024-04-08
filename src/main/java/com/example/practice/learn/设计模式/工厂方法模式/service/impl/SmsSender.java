package com.example.practice.learn.设计模式.工厂方法模式.service.impl;

import com.example.practice.learn.设计模式.工厂方法模式.service.Sender;

public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is sms sender!");
    }
}
