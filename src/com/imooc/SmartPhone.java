package com.imooc;

/**
 * Created by Dudaizhong on 2015/10/14.
 */
public class SmartPhone extends Telphone implements IPlayGame {
    public void call() {
        System.out.println("通过语音来打电话");
    }

    @Override
    public void sendMessage() {
        System.out.println("通过语音来发短信");
    }

    @Override
    public void playGame() {
        System.out.println("手机具有玩游戏的功能");
    }
}
