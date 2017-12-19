package com.demo.misaki.handlertest;

import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void MissionStart(View view) {
        Mission_01 mission_01=new Mission_01();
        mission_01.start();
        Message msg=new Message();
        msg.what=0x123;
        Bundle data=new Bundle();
        data.putString("msg_key","请开始任务");
        msg.setData(data);
        mission_01.mhandler.sendMessage(msg);
    }
}
