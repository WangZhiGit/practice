package com.example.practice.learn.简单工厂模式_普通.service.impl;

import com.example.practice.learn.简单工厂模式_普通.service.Sender;

public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is mail sender!");
    }
}
