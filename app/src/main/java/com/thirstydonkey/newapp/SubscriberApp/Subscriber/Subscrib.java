package com.thirstydonkey.newapp.SubscriberApp.Subscriber;

public class Subscrib implements IElement2 {
    private String Name;
    private String Text;
    public Subscrib(String Name) {
        this.Name = Name;
    }

    @Override
    public Coord GetCoord() {
        return null;
    }

    @Override
    public void SetCoord(Coord coord) {

    }

    @Override
    public void Notified(String str) {
        this.Text = this.Name + " " + str;
        System.out.println(this.Text);
    }
    @Override
    public String Snapshot() {
        return this.Text;
    }

    @Override
    public IElement2 Clone() {
        return null;
    }

    @Override
    public IElement2 Clone(String str) {
        return null;
    }

    @Override
    public IElement2 CloneCoord() {
        return null;
    }

    @Override
    public void Update(){
    }

}
