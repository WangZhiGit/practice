package com.example.practice.learn.设计模式.简单工厂模式_多个方法.factory;

import com.example.practice.learn.设计模式.简单工厂模式_多个方法.service.Sender;
import com.example.practice.learn.设计模式.简单工厂模式_多个方法.service.impl.MailSender;
import com.example.practice.learn.设计模式.简单工厂模式_多个方法.service.impl.SmsSender;

/**
 * 简单工厂模式_多个方法：是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，而多个工厂方法模式是提供多个工厂方法，分别创建对象
 */
public class SendFactory {
    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }
}
