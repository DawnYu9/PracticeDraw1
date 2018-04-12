package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {
    private Paint paint;
    private int[] heights = {100, 200, 300, 400, 500};
    private String[] names = {"a", "bb", "ccc", "dd", "ee"};
    private int width = 100;
    private int space = 20;
    private int coordLength = 700;
    private int originX = 100;
    private int originY = 100 + coordLength;

    public Practice10HistogramView(Context context) {
        this(context, null);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);

        // 移动原点
        canvas.translate(originX, originY);

        // 坐标系
        paint.setColor(Color.WHITE);
        canvas.drawLine(0, 0, 0, -coordLength, paint);
        canvas.drawLine(0, 0, coordLength, 0, paint);

        // 直方图
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.GREEN);
        paint.setTextSize(40);

        float left = space;

        for (int i = 0; i < heights.length; i++) {
            canvas.drawRect(left, -heights[i], left + width, 0, paint);
            float textLeft = left + (width - getTextBounds(names[i], paint).width()) / 2;
            canvas.drawText(names[i], textLeft, 50, paint);

            left += width + space;
        }
    }

    /**
     * 测量文字大小
     *
     * @param text
     * @param paint
     * @return
     */
    private Rect getTextBounds(String text, Paint paint) {
        Rect rect = new Rect();
        paint.getTextBounds(text, 0, text.length(), rect);
        return rect;
    }
}
