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

}
