package com.example.practice.learn.简单工厂模式_多个静态方法.test;

import com.example.practice.learn.简单工厂模式_多个静态方法.factory.SendFactory;
import com.example.practice.learn.简单工厂模式_多个静态方法.service.Sender;
import org.testng.annotations.Test;

public class FactoryTest {

    @Test
    void produce() {
        Sender sender = SendFactory.produceMail();
        sender.send();
    }
}