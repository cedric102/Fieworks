package com.thirstydonkey.newapp.SubscriberApp.Subscriber;

// import com.thirstydonkey.newapp.Prototype.Prototype;

public class Particle implements IElement2 {

    private String Name;
    private String Text;

    /////////

    private Coord coord;

    public Particle(String Name, int x, int y) {
        coord = new Coord();
        this.Name = Name;
        this.coord.x = x;
        this.coord.y = y;
    }
    public Particle(Particle prot) {
        if (prot != null) {
            coord = new Coord();
            this.coord.x = prot.coord.x;
            this.coord.y = prot.coord.y;
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
    }
    @Override
    public String Snapshot() {
        return this.Text;
    }
    @Override
    public void Update() {
        this.coord.x += this.coord.dirX;
        this.coord.y += this.coord.dirY;
        this.coord.x += this.coord.dirX;
        this.coord.y += this.coord.dirY;
    }

    //////////////////


    @Override
    public Coord GetCoord(){
        return coord;
    }
    @Override
    public void SetCoord(Coord coord_){
        this.coord = new Coord(coord_);
        coord.x = coord_.x;
        coord.y = coord_.y;
    }

    @Override
    public IElement2 Clone() {
        return new Particle(this);
    }

    @Override
    public IElement2 Clone(String str) {
        return new Particle(str , coord.x , coord.y);
    }

    @Override
    public IElement2 CloneCoord() {
        return new Particle(this);
    }

}
