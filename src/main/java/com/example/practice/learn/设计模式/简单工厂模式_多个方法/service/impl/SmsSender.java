package com.example.practice.learn.设计模式.简单工厂模式_多个方法.service.impl;

import com.example.practice.learn.设计模式.简单工厂模式_多个方法.service.Sender;

public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is sms sender!");
    }
}
