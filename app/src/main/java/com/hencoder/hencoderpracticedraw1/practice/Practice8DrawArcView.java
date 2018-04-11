package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        paint.setStyle(Paint.Style.FILL);
        canvas.drawArc(50, 50, 400, 250,
                30, 100, true, paint);
        canvas.drawArc(50, 50, 400, 250,
                30, -100, false, paint);

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(450, 100, 800, 400,
                -10, -50, true, paint);
        canvas.drawArc(450, 100, 800, 400,
                30, 80, false, paint);
    }
}
