package com.thirstydonkey.newapp.Prototype;


public class Proto implements Prototype {
    private int x=10;
    private int y=10;
    private Coord coord;

    public Proto() {

    }
    public Proto(Proto prot) {
        if (prot != null) {
            this.x = prot.GetX();
            this.y = prot.GetY();
        }
    }
    @Override
    public Coord GetCoord(){
        return coord;
    }
    @Override
    public void SetCoord(Coord coord){
        this.coord = coord;
    }
    @Override
    public void SetCoord(int x, int y){
        this.coord.x = x;
        this.coord.y = y;
    }

    @Override
    public int GetX() {
        return this.x;
    }

    @Override
    public int GetY() {
        return this.y;
    }

    @Override
    public void SetX(int x) {
        this.x = x;
    }

    @Override
    public void SetY(int y) {
        this.y = y;
    }

    @Override
    public Prototype Clone() {
        return new Proto(this);
    }

    @Override
    public Prototype CloneCoord() {
        return new Proto(this);
    }
}
