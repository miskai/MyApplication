package com.demo.misaki.handlertest;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

/**
 * Created by misaki on 2017/12/19.
 */

public class Mission_02 extends Thread {
    private Handler mhandler;
    private Context ctx;
    public Mission_02(Context ctx,Handler handler){
        this.ctx=ctx;
        this.mhandler=handler;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Message msg=new Message();
        msg.what=0x124;
        Bundle data=new Bundle();
        data.putString("key_2","Mission_2发送成功");
        msg.setData(data);
        this.mhandler.sendMessage(msg);
    }
}
