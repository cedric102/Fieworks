package com.thirstydonkey.newapp.Subscriber;

public interface IElement {
    void Notified(String str);
    void Update();
    String Snapshot();
}
