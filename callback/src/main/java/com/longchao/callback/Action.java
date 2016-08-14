package com.longchao.callback;

/**
 * Created by longchao.zlc on 2016/8/14.
 */
public interface Action {
    public boolean transactionMethod(String content);

    public boolean commitMethod();

    public boolean simpleMethod(String content);
}
