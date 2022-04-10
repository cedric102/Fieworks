package com.thirstydonkey.newapp.SubscriberApp.Subscriber;

public class Particle implements IElement2 {

    private String Name;
    private String Text;

    /////////

    private Coord coord;

    public Particle(String Name, int x, int y) {
        coord = new Coord();
        this.Name = Name;
        this.coord.position.x = x;
        this.coord.position.y = y;
    }
    public Particle(Particle prot) {
        if (prot != null) {
            coord = new Coord();
            this.Name = prot.Name;
            this.Text = prot.Text;
            this.coord.position.x = prot.coord.position.x;
            this.coord.position.y = prot.coord.position.y;
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
        this.coord.position.x += this.coord.speed.x;
        this.coord.position.y += this.coord.speed.y;
/*        this.coord.speed.x += this.coord.speed.x;
        this.coord.speed.y += this.coord.speed.y;*/
    }

    //////////////////


    @Override
    public Coord GetCoord(){
        return coord;
    }
    @Override
    public void SetCoord(Coord coord_){
        this.coord = new Coord(coord_);
        coord.position.x = coord_.position.x;
        coord.position.y = coord_.position.y;
    }

    @Override
    public IElement2 Clone() {
        return new Particle(this);
    }

    @Override
    public IElement2 Clone(String str) {
        System.out.println("Clone");
        return new Particle(str , coord.position.x , coord.position.y);
    }

}
