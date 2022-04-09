package com.thirstydonkey.newapp.Prototype;

public interface Prototype {
    class Coord {
        public int x;
        public int y;
    }

    Coord GetCoord();
    void SetCoord(Coord coord);
    void SetCoord(int x, int y);
    int GetX();
    int GetY();
    void SetX(int x);
    void SetY(int y);
    Prototype Clone();
    Prototype CloneCoord();
}
