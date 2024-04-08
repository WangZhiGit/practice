package com.example.practice.learn.简单工厂模式_多个方法.test;

import com.example.practice.learn.简单工厂模式_多个方法.factory.SendFactory;
import com.example.practice.learn.简单工厂模式_多个方法.service.Sender;
import org.testng.annotations.Test;

public class FactoryTest {

    @Test
    void produce() {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produceMail();
        sender.send();
    }
}