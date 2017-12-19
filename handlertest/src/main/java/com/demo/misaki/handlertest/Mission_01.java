package com.demo.misaki.handlertest;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by misaki on 2017/12/19.
 */

public class Mission_01 extends Thread {
    public Handler mhandler=new Handler(){
            @Override
            public void handleMessage(Message msg) {
                if(msg!=null){
                    switch (msg.what){
                        case 0x123:
                            Log.i("msg_1","Mission1收到消息");
                            Mission_02 mission_02=new Mission_02(null,mhandler);
                            mission_02.start();
                            break;
                        case 0x124:
                            //getString()的参数key值必需正确，否则报错
                            String str=msg.getData().getString("key_2");
                            Log.i("msg_1",str);
                            break;
                    }
                }
            }
        };
    @Override
    public void run() {
        Log.i("msg_1","looper建立");
        //建立looper对象和消息队列
        Looper.prepare();
        //启动loop
        Looper.loop();
    }
}
