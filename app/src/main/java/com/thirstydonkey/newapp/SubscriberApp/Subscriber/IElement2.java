package com.thirstydonkey.newapp.SubscriberApp.Subscriber;

import com.thirstydonkey.newapp.Prototype.Prototype;

public interface IElement2 {
    class Coord {
        int x;
        int y;
        int dirX = 0;
        int dirY = 0;
        Coord() {}
        Coord(Coord coord) {
            x = coord.x;
            y = coord.y;
            dirX = coord.dirX;
            dirY = coord.dirY;
        }
    }

    Coord GetCoord();
    void SetCoord(Coord coord);

    void Notified(String str);
    void Update();
    String Snapshot();

    IElement2 Clone();
    IElement2 Clone(String str);
}
