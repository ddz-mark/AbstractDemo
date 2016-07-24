package com.imooc;

/**
 * Created by Dudaizhong on 2015/10/14.
 */
public class CellPhone extends Telphone {

    @Override
    public void call() {
        System.out.println("通过键盘来打电话");
    }

    @Override
    public void sendMessage() {
        System.out.println("通过键盘来发短信");
    }
}
