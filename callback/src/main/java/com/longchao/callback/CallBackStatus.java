package com.longchao.callback;


import lombok.Getter;
import lombok.Setter;

/**
 * Created by longchao.zlc on 2016/8/14.
 */
public class CallBackStatus {

    public static enum Status {
        COMMITTED,
        ROLLBACK,
        NOACTION;
    }

    @Getter @Setter
    private String buyerId;

    @Getter @Setter
    private String reason;

    @Getter @Setter
    private boolean rollbackOnly = false;

    @Getter @Setter
    private Status status = null;



}
