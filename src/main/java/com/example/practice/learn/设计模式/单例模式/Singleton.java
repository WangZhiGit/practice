package com.example.practice.learn.设计模式.单例模式;

/**
 * 单例对象（Singleton）是一种常用的设计模式。在Java应用中，单例对象能保证在一个JVM中，该对象只有一个实例存在。这样的模式有几个好处： 1、某些类创建比较频繁，对于一些大型的对象，这是一笔很大的系统开销。 2、省去了new操作符，降低了系统内存的使用频率，减轻GC压力。 3、有些类如交易所的核心交易引擎，控制着交易流程，如果该类可以创建多个的话，系统完全乱了。
 */
public class Singleton {

    // 持有私有静态实例，防止被引用，此处赋值为 null ，目的是实现延迟加载
    private static volatile Singleton instance = null;

    //私有构造方法，防止被实例化
    private Singleton() {

    }

    // 静态工程方法，创建实例
    public static Singleton getInstance() {
        if (instance == null){
            synchronized (instance){
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public Object readResolve(){
        return instance;
    }
}
