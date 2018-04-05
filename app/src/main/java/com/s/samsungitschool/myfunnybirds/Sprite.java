package com.s.samsungitschool.myfunnybirds;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

import java.util.ArrayList;
import java.util.List;

public class Sprite {
    // Ссылка на изображение с набором кадров
    Bitmap bitmap;
    // Коллекция прямоугольных областей на изображении – кадры,
    // которые участвуют в анимационной последовательности
    ArrayList<Rect> frames;
    // Ширина и высоту кадра для отображения на экране
    int frameWidth, frameHeight;
    // Номер текущего фрейма
    int currentFrame;
    // Время, отведенное на отображение
    // каждого кадра анимационной последовательности
    double frameTime;
    //Текущее время отображения кадра.
    // Номер текущего кадра currentFrame меняется на следующий
    // при достижении переменной timeForCurrentFrame значения из frameTime
    double timeForCurrentFrame;
    double x, y;
    // Скорости перемещения спрайта по оси X и Y соответственно
    double velocityX, velocityY;
    //Внутренний отступ от границ спрайта, необходимый для более точного определения пересечений спрайтов
    int padding;

    public Sprite(double x, double y, double velocityX, double velocityY, Rect initialFrame, Bitmap bitmap) {

        this.x = x;
        this.y = y;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
        this.bitmap = bitmap;
        this.frames = new ArrayList<Rect>();
        this.frames.add(initialFrame);
        this.bitmap = bitmap;
        this.timeForCurrentFrame = 0.0;
        this.frameTime = 0.1;
        this.currentFrame = 0;
        this.frameWidth = initialFrame.width();
        this.frameHeight = initialFrame.height();
        this.padding = 20;
    }

    /*
    // Метод для обновления внутреннего состояния справйта
    public void update(int ms) {

        timeForCurrentFrame += ms;// <=> timeForCurrentFrame = timeForCurrentFrame + ms;

        if (timeForCurrentFrame >= frameTime) {
            currentFrame = (currentFrame + 1) % frames.size();
            timeForCurrentFrame = timeForCurrentFrame - frameTime;
        }

        //  В зависимости от времени и скорости по осям X и Y
        // осуществляется изменение координат спрайта на экране.
        x = x + velocityX * ms/1000.0;
        y = y + velocityY * ms/1000.0;
    }*/

    /*
    // Метод draw() рисует на переданном холсте текущий кадр frames.get(currentFrame)
    // в области экрана, заданной в прямоугольнике destination
    public void draw(Canvas canvas) {
        Paint paint = new Paint();
        Rect destination = new Rect( (int) x, (int) y, (int)(x + frameWidth), (int)(y + frameHeight));
        canvas.drawBitmap(bitmap, frames.get(currentFrame), destination, paint);
    }*/

    //TODO ==== Добовить Getters и Setters ====


    //TODO ====================================

    /*
    // Метод, возвращающий прямоугольную область,
    // участвующую в определении столкновений
    public Rect getBoundingBoxRect () {
        return new Rect(
                (int)x + padding,
                (int)y + padding,
                (int)(x + frameWidth - padding),
                (int)(y + frameHeight - padding));
    }*/

    //TODO ==== Метод определения пересечения спрайтов ====


    //TODO ================================================
}
