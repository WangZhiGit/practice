package com.example.practice.learn.设计模式.简单工厂模式_普通.test;

import com.example.practice.learn.设计模式.简单工厂模式_普通.service.Sender;
import com.example.practice.learn.设计模式.简单工厂模式_普通.factory.SendFactory;
import org.testng.annotations.Test;

public class FactoryTest {

    @Test
    void produce() {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("sms");
        sender.send();
    }
}