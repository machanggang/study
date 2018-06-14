package org.maquer.java.designmode.prototype;

/**
 * 设计模式--原型模式，此类是其基本模型
 * 
 * @author xiaoma
 */
// 实现Cloneable接口，标记此类可以正常使用Object.clone()方法而不抛异常
public class PrototypePattern implements Cloneable {

    /**
     * 覆盖Object.clone()，提升该方法的可见性（从protected提升为public），同时对引用类型进行“拷贝”
     * 
     * @see java.lang.Object#clone()
     */
    public PrototypePattern clone() {
        PrototypePattern pro = null;
        try {
            pro = (PrototypePattern) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return pro;
    }
}
