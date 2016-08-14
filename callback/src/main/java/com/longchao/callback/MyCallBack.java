package com.longchao.callback;

/**
 * Created by longchao.zlc on 2016/8/14.
 */
public interface MyCallBack {
    /**
     * 执行业务处理，如果抛出RuntimeExceptin或status.setRollbackOnly()，则会回滚消息
     *
     * @param status
     * @return
     */
    public Object doInTransaction(CallBackStatus status);
}
