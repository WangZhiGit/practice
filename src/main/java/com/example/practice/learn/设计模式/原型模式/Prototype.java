package com.example.practice.learn.设计模式.原型模式;

import java.io.*;

/**
 * 原型模式虽然是创建型的模式，但是与工程模式没有关系，从名字即可看出，该模式的思想就是将一个对象作为原型，对其进行复制、克隆，产生一个和原对象类似的新对象。
 */
public class Prototype implements Cloneable, Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 浅复制
     *
     * @return 对象
     * @throws CloneNotSupportedException 异常
     */
    public Object clone() throws CloneNotSupportedException {
        Prototype prototype = (Prototype) super.clone();
        return prototype;
    }

    /**
     * 深复制
     *
     * @return 对象
     * @throws IOException 异常
     * @throws ClassNotFoundException 异常
     */
    public Object deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }
}


