package com.thirstydonkey.newapp.SubscriberApp.Subscriber;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

//import com.thirstydonkey.newapp.Prototype.Prototype;

import java.util.ArrayList;

public class PublisherBox {
    private ArrayList<IElement2> subscriberList;
    public  int color;
    Paint paint;
    ArrayList<IElement2> subscriberListTemp;
    public PublisherBox() {
        paint = new Paint();
        color = Color.BLUE;
        paint.setColor(color);
        subscriberList = new ArrayList<>();
        subscriberListTemp = new ArrayList<>();
    }
    public void Add() {
        subscriberList.add(new Subscrib("Box"));
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

        subscriberListTemp.clear();
        int i=0;
        for(IElement2 elem : subscriberList) {
            System.out.println("Cloning : " + i);
i++;
            subscriberListTemp.add(elem.Clone("Name " + (subscriberListTemp.size() + subscriberList.size())));

            IElement2 el = subscriberListTemp.get(subscriberListTemp.size() - 1);
            el.GetCoord().x -= 100;
            el.SetCoord(el.GetCoord());
         //   System.out.println("Cloned");
         //   IElement2.Coord coord = el.GetCoord();
         //   System.out.println("Get Coord");
         //   coord.x -= 100;
         //   System.out.println("Adjust Coord");
         //   el.SetCoord(coord);
         //   System.out.println("Set Coord");
        }
        for(IElement2 elem : subscriberListTemp)
            subscriberList.add(elem);
    }
    public void Snapshot(String str , Canvas canvas) {
        for(IElement2 elem : subscriberList) {
            canvas.drawCircle( elem.GetCoord().x ,elem.GetCoord().y ,20 , paint);
        }
    }

}
