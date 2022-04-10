package com.thirstydonkey.newapp.SubscriberApp.Subscriber;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import java.util.ArrayList;

public class PublisherBox {
    private ArrayList<IElement2> subscriberList;
    public  int color;
    Paint paint;
    ArrayList<IElement2> subscriberAddList;
    ArrayList<IElement2> subscriberRemoveList;
    public PublisherBox() {
        paint = new Paint();
        color = Color.BLUE;
        paint.setColor(color);
        subscriberList = new ArrayList<>();
        subscriberAddList = new ArrayList<>();
        subscriberRemoveList = new ArrayList<>();
    }
    public void Register(IElement2 Elem) {
        subscriberList.add(Elem);
    }
    public void DeRegister(IElement2 Elem) {
        subscriberList.remove(Elem);
    }
    public void Notify(String str) {
        for(IElement2 elem : subscriberList) {
            elem.Notified(str);
            elem.Update();
        }
    }
    public void Clone(String str) {

        subscriberAddList.clear();
        subscriberRemoveList.clear();
        int i=0;
        for(IElement2 elem : subscriberList) {
            i++;

            for(int j=0 ; j<360 ; j+=60) {
                subscriberAddList.add(elem.Clone("Name " + (subscriberAddList.size() + subscriberList.size())));

                IElement2 el = subscriberAddList.get(subscriberAddList.size() - 1);
                el.GetCoord().dirX += 5 * Math.cos(i);
                el.GetCoord().dirY += 5 * Math.sin(i);
                el.SetCoord(el.GetCoord());
            }
            subscriberRemoveList.add(elem);
        }
        subscriberList.addAll(subscriberAddList);
        subscriberList.removeAll(subscriberRemoveList);
    }
    public void Snapshot(String str , Canvas canvas) {
        for(IElement2 elem : subscriberList) {
            canvas.drawCircle( elem.GetCoord().x ,elem.GetCoord().y ,20 , paint);
        }
    }

}
