package com.imooc;

/**
 * Created by Dudaizhong on 2015/10/14.
 */
public class Test {
    public static void main(String[] args) {
        Telphone tel1 = new CellPhone();
        tel1.call();
        tel1.sendMessage();
        Telphone tel2 = new SmartPhone();
        tel2.call();
        tel2.sendMessage();

        IPlayGame ip1 = new SmartPhone();
        ip1.playGame();
        IPlayGame ip2 = new Psp();
        ip2.playGame();
    }
}
