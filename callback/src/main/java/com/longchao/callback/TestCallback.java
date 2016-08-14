package com.longchao.callback;

/**
 * Created by longchao.zlc on 2016/8/14.
 */
public class TestCallback {

    public static void main(String[] args){

        ActionA actionA = new ActionA();
        actionA.setJoinAction(new ActionB());
        actionA.transactionMethod("hello callback");

    }

}
