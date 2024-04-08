package com.example.practice.learn.简单工厂模式_普通.factory;

import com.example.practice.learn.简单工厂模式_普通.service.Sender;
import com.example.practice.learn.简单工厂模式_普通.service.impl.MailSender;
import com.example.practice.learn.简单工厂模式_普通.service.impl.SmsSender;

/**
 * 简单工厂模式_普通：建立一个工厂类，对实现了同一接口的一些类进行实例的创建
 */
public class SendFactory {
    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型！");
            return null;
        }
    }
}
