package com.s.samsungitschool.myfunnybirds;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.CountDownTimer;
import android.view.MotionEvent;
import android.view.View;


public class GameView extends View {
    // Размеры экрана w-ширина, h-высота
    int viewWidth, viewHeight;
    // Набранные очки
    int points = 0;
    // Промежуток времени, за который должно происходить изменение игровой модели
    public int timeInterval = 30;


    public GameView(Context context) {
        super(context);
    }

    // Метод для рисования
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // Отрисовка фона и очков
        canvas.drawARGB(250, 127,199,255);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextSize(55.0f);
        paint.setColor(Color.WHITE);
        canvas.drawText(points + "", viewWidth - 100, 70, paint);

        // Отрисовка птицы на экране

    }

    // Метод, вызывабщийся при изменении игрового поля
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        // Запоминание размеров экрана
        viewWidth = w;
        viewHeight = h;
    }
}