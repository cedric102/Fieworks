package com.thirstydonkey.newapp.SubscriberApp.Subscriber;

// import com.thirstydonkey.newapp.Prototype.Prototype;

public class Particle implements IElement2 {

    private String Name;
    private String Text;

    /////////

    private int x=10;
    private int y=10;
    private int dirX = 10;
    private int dirY = 10;

    private Coord coord;

    public Particle(String Name, int x, int y) {
        coord = new Coord();
        this.Name = Name;
        this.x = x;
        this.y = y;
        coord.x = x;
        coord.y = y;
    }
    public Particle(Particle prot) {
        if (prot != null) {
            coord = new Coord();
            this.dirX = prot.dirX;
            this.dirY = prot.dirY;
            this.x = prot.x;
            this.y = prot.y;
            this.coord.x = prot.x;
            this.coord.y = prot.y;
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
    //    System.out.println(this.Text + " => " + this.x + " ; " + this.y);
    }
    @Override
    public String Snapshot() {
        return this.Text;
    }
    @Override
    public void Update() {
        this.x += this.dirX;
        this.y += this.dirY;
        this.coord.x += this.dirX;
        this.coord.y += this.dirY;
    }

    //////////////////


    @Override
    public Coord GetCoord(){
        return coord;
    }
    @Override
    public void SetCoord(Coord coord){
        this.coord = new Coord(coord);
        x = coord.x;
        y = coord.y;
    }

    @Override
    public IElement2 Clone() {
        return new Particle(this);
    }

    @Override
    public IElement2 Clone(String str) {
        return new Particle(str , x , y);
    }

    @Override
    public IElement2 CloneCoord() {
        return new Particle(this);
    }

}
