package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    Path path = new Path();

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        path.moveTo(50, 50);
        path.lineTo(50, 600);
        path.lineTo(800, 600);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);

        paint.setColor(Color.WHITE);

        canvas.drawPath(path, paint);

        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.GREEN);
        paint.setTextSize(40);

        canvas.drawRect(100, 550, 150, 600, paint);
        canvas.drawText("1", 100, 650, paint);
        canvas.drawRect(170, 400, 220, 600, paint);
        canvas.drawText("2", 170, 650, paint);
        canvas.drawRect(240, 300, 290, 600, paint);
        canvas.drawText("3", 240, 650, paint);
        canvas.drawRect(310, 100, 360, 600, paint);
        canvas.drawText("4", 310, 650, paint);
        canvas.drawRect(380, 200, 430, 600, paint);
        canvas.drawText("5", 380, 650, paint);
    }
}
