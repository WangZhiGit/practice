package com.example.practice.learn.简单工厂模式_多个静态方法.factory;

import com.example.practice.learn.简单工厂模式_多个静态方法.service.Sender;
import com.example.practice.learn.简单工厂模式_多个静态方法.service.impl.MailSender;
import com.example.practice.learn.简单工厂模式_多个静态方法.service.impl.SmsSender;

/**
 * 简单工厂模式_多个静态方法：将多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可
 */
public class SendFactory {
    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }
}
