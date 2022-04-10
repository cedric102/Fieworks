package com.thirstydonkey.newapp.SubscriberApp.Subscriber;

import com.thirstydonkey.newapp.Prototype.Prototype;

public interface IElement2 {
    class Coord {
        class Position {
            int x;
            int y;
        }
        class Speed {
            int x;
            int y;
        }
        Position position;
        Speed speed;
/*        int x;
        int y;
        int dirX = 0;
        int dirY = 0;*/
        Coord() {
            position = new Position();
            speed = new Speed();
        }
        Coord(Coord coord) {
            position = new Position();
            speed = new Speed();
            position.x = coord.position.x;
            position.y = coord.position.y;
            speed.x = coord.speed.x;
            speed.y = coord.speed.y;
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
