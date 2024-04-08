package com.example.practice.learn.设计模式.工厂方法模式.factory.impl;

import com.example.practice.learn.设计模式.工厂方法模式.factory.Provider;
import com.example.practice.learn.设计模式.工厂方法模式.service.Sender;
import com.example.practice.learn.设计模式.工厂方法模式.service.impl.SmsSender;

/**
 * 工厂方法模式：简单工厂模式有一个问题就是，类的创建依赖工厂类，也就是说，如果想要拓展程序，必须对工厂类进行修改，这违背了闭包原则，所以，从设计角度考虑，有一定的问题，如何解决？就用到工厂方法模式，创建一个工厂接口和创建多个工厂实现类，这样一旦需要增加新的功能，直接增加新的工厂类就可以了，不需要修改之前的代码。
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
