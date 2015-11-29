package com.example.noelpaulino.lbycp24;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Noel Paulino on 11/28/2015.
 */
public class GreenTarget extends View {

    public GreenTarget(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint green = new Paint();
        green.setARGB(255, 0, 255, 0);

        Paint white = new Paint();
        white.setARGB(255, 255, 255, 255);


        int x = (canvas.getWidth() < canvas.getHeight())? canvas.getWidth() : canvas.getHeight();

        for (int i = 0; i < 11; i++) {
            canvas.drawCircle(canvas.getWidth()/2, canvas.getHeight()/2, x*(10-i)/20, i % 2 == 0 ? green : white);
        }
    }
}
