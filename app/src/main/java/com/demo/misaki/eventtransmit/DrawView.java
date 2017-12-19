package com.demo.misaki.eventtransmit;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by misaki on 2017/12/19.
 */

public class DrawView extends View {
    //初始坐标
    public float currentX=40;
    public float currentY=40;
    //实例化画笔
    Paint p=new Paint();
    public DrawView(Context context,AttributeSet attributeSet) {
        super(context,attributeSet);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        p.setColor(Color.BLACK);
        canvas.drawCircle(currentX,currentY,15,p);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        currentX=event.getX()+30;
        currentY=event.getY()+30;
        this.invalidate();
        return false;
    }
}
