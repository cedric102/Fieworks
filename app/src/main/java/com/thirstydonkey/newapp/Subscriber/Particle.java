package com.thirstydonkey.newapp.Subscriber;

import com.thirstydonkey.newapp.Prototype.Prototype;

public class Particle implements IElement, Prototype {

    private String Name;
    private String Text;

    /////////

    private int x=10;
    private int y=10;
    private int dirX = 10;
    private int dirY = 10;

    private Coord coord;

    public Particle(String Name, int x, int y) {
        this.Name = Name;
        this.x = x;
        this.y = y;
    }
    public Particle(Particle prot) {
        if (prot != null) {
            this.x = prot.GetX();
            this.y = prot.GetY();
            this.Name = prot.Name;
            this.Text = prot.Text;
        }
    }
    public Particle(String Name) {
        this.Name = Name;
    }
    @Override
    public void Notified(String str) {
        this.Text = this.Name + " ; " + str;
        System.out.println(this.Text + " => " + this.x + " ; " + this.y);
    }
    @Override
    public String Snapshot() {
        return this.Text;
    }
    @Override
    public void Update() {
        this.x += this.dirX;
        this.y += this.dirY;
    }

    //////////////////


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
        return new Particle(this);
    }

    @Override
    public Prototype CloneCoord() {
        return new Particle(this);
    }

}
