package com.longchao.callback;

/**
 * Created by longchao.zlc on 2016/8/14.
 */
public class ActionB implements Action{


    public boolean transactionMethod(String content) {
        return false;
    }

    public boolean commitMethod() {
        return false;
    }

    public boolean simpleMethod(String content) {
        System.out.println("call method B");
        return true;
    }
}
