package com.example.practice.learn.设计模式.简单工厂模式_多个静态方法.service.impl;

import com.example.practice.learn.设计模式.简单工厂模式_多个静态方法.service.Sender;

public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is mail sender!");
    }
}
