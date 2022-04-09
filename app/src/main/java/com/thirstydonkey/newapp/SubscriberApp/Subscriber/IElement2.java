package com.thirstydonkey.newapp.SubscriberApp.Subscriber;

import com.thirstydonkey.newapp.Prototype.Prototype;

public interface IElement2 {
    class Coord {
        public int x;
        public int y;
        Coord() {}
        Coord(Coord coord) {
            x = coord.x;
            y = coord.y;
        }
    }

    Coord GetCoord();
    void SetCoord(Coord coord);

    void Notified(String str);
    void Update();
    String Snapshot();

    IElement2 Clone();
    IElement2 Clone(String str);
    IElement2 CloneCoord();
}
