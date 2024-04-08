package com.example.practice.learn.设计模式.工厂方法模式.test;

import com.example.practice.learn.设计模式.工厂方法模式.factory.Provider;
import com.example.practice.learn.设计模式.工厂方法模式.factory.impl.SendMailFactory;
import com.example.practice.learn.设计模式.工厂方法模式.service.Sender;
import org.testng.annotations.Test;

public class FactoryTest {

    @Test
    void produce() {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.send();
    }
}