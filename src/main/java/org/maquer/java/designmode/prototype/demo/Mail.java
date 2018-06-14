package org.maquer.java.designmode.prototype.demo;

public class Mail implements Cloneable {

    private String receiver;

    private String subject;

    private String content;

    private String tail;

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    public Mail clone() {
        Mail mail = null;
        try {
            mail = (Mail) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return mail;
    }

    public void send() {
        System.out.println("邮件主题：" + this.subject);
        System.out.println("发送给“" + this.receiver + "”，内容：");
        System.out.println(this.content);
        System.out.println("-------------------------" + this.tail + "--------------------------");
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        String subject = "我是邮件主题";
        String content = "我是邮件内容";

        // 原型
        Mail mail = new Mail();
        mail.setSubject(subject);
        mail.setContent(content);
        mail.setTail("来自帅气的小尾巴");

        for (int i = 0; i < 10; i++) {
            Mail m = mail.clone();
            String name = "zhangsan" + i;
            m.setReceiver(name + "@xxx.com");
            m.setContent("亲爱的" + name + "同学，" + content);
            m.send();
        }
    }

}
