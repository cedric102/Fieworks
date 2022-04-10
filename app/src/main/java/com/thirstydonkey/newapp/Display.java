package com.thirstydonkey.newapp;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

import com.thirstydonkey.newapp.SubscriberApp.Subscriber.Particle;
import com.thirstydonkey.newapp.SubscriberApp.Subscriber.PublisherBox;

public class Display extends View {

    PublisherBox publisherBox;
    int count = 0;

    public Display(Context ctx) {
        super(ctx);
        System.out.println("Display");
        publisherBox = new PublisherBox();
        publisherBox.Register(new Particle("Name 1" , 500,700));
        publisherBox.Register(new Particle("Name 2" , 550,750));
        publisherBox.Register(new Particle("Name 3" , 600,800));
        publisherBox.Notify("NotifiedDisplay");
    }

    @Override
    public void onDraw(Canvas canvas) {

        super.onDraw(canvas);
        invalidate();
        if(count > 70) {
            publisherBox.Clone("Cloning");
            count = 0;
        }
        ++count;

        publisherBox.Notify("NotifiedDisplay");
        publisherBox.Snapshot("NotifiedDisplay" , canvas);
    }
}
