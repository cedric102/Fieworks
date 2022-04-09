package com.thirstydonkey.newapp.Subscriber;

import com.thirstydonkey.newapp.Prototype.Prototype;

public class Subscrib implements IElement {
    private String Name;
    private String Text;
    public Subscrib(String Name) {
        this.Name = Name;
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
    public void Update(){
    }

}
