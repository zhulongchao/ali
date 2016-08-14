package com.longchao.callback;

/**
 * Created by longchao.zlc on 2016/8/14.
 */
public class ActionA implements Action{

    private Action joinAction;

    public void setJoinAction(Action action){
        joinAction = action;
    }

    private boolean transactionMethodA(String content, final MyCallBack runner) {
        System.out.println("execute methodA async,not commit result");

        CallBackStatus msgStatus = new CallBackStatus();
        runner.doInTransaction(msgStatus);

        if(msgStatus.isRollbackOnly()){
            System.out.println("rollback method A");
            return false;
        }else{
            joinAction.simpleMethod("");
            return true;
        }

    }
    public boolean transactionMethod(String content){
        MyCallBack callback = new MyCallBack() {
            public Object doInTransaction(CallBackStatus status) {
                boolean result = commitMethod();
                if(result){
                    status.setRollbackOnly(false);
                }else{
                    status.setRollbackOnly(true);
                }
                return null;
            }
        };

        return transactionMethodA(content,callback);
    }

    public boolean simpleMethod(String content){
        System.out.println("commit methodA");
        return true;
    }

    public boolean commitMethod(){
        System.out.println("commit method A");
        return true;
    }


}
