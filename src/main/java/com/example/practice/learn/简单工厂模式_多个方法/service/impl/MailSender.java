package com.example.practice.learn.简单工厂模式_多个方法.service.impl;

import com.example.practice.learn.简单工厂模式_多个方法.service.Sender;

public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is mail sender!");
    }
}
