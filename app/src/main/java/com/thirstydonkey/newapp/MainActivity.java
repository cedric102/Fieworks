package com.thirstydonkey.newapp;

import android.os.Bundle;


import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.thirstydonkey.newapp.Logic.Logic;
import com.thirstydonkey.newapp.Prototype.Proto;
import com.thirstydonkey.newapp.Prototype.Prototype;
import com.thirstydonkey.newapp.Subscriber.IElement;
import com.thirstydonkey.newapp.Subscriber.PublisherBox;
import com.thirstydonkey.newapp.Subscriber.Subscrib;

public class MainActivity extends AppCompatActivity {

    public void Display(View view) {

        setContentView(new Display(this));
    }
    public void myGravity(View view) {
        Proto prot = new Proto();
        Proto tempProt = new Proto();
        Prototype.Coord coord = new Prototype.Coord();
        coord.x = 20;
        coord.y = 30;
        tempProt.SetCoord(coord);
        Prototype tempProt2 = tempProt.Clone();
        Prototype.Coord coord2 = new Prototype.Coord();
        coord2.x = 40;
        coord2.y = 40;
        coord.x = 100;
        tempProt2.SetCoord(coord2);
        prot.SetX(20);
        prot.SetY(30);
        Prototype prot2 = prot.Clone();
        prot.SetX(40);
        prot.SetY(40);
        System.out.println("Value of I : " + prot.GetX() + ";" + prot.GetY() );
        System.out.println("Value of 2 : " + prot2.GetX() + ";" + prot2.GetY() );

        System.out.println("Value of I : " + tempProt.GetCoord().x + " ; " + tempProt.GetCoord().y );
        System.out.println("Value of 2 : " + tempProt2.GetCoord().x + " ; " + tempProt2.GetCoord().y );

        PublisherBox pubBox = new PublisherBox();
        IElement elem1 = new Subscrib("Elem 1");
        IElement elem2 = new Subscrib("Elem 2");
        IElement elem3 = new Subscrib("Elem 3");
        pubBox.Register(elem1);
        pubBox.Add();
        pubBox.Notify("Notified 1");
        pubBox.Register(elem2);
        pubBox.Register(elem3);
        pubBox.Notify("Notified 2");
        pubBox.DeRegister(elem2);
        pubBox.Notify("Notified 3");


   //     setContentView(R.layout.activity_main);
    }
    public void myGravity() {

        Proto prot = new Proto();
        Proto tempProt = new Proto();
        Prototype.Coord coord = new Prototype.Coord();
        coord.x = 20;
        coord.y = 30;
        tempProt.SetCoord(coord);
        Prototype tempProt2 = tempProt.Clone();
        Prototype.Coord coord2 = new Prototype.Coord();
        coord2.x = 40;
        coord2.y = 40;
        coord.x = 100;
        tempProt2.SetCoord(coord2);
        prot.SetX(20);
        prot.SetY(30);
        Prototype prot2 = prot.Clone();
        prot.SetX(40);
        prot.SetY(40);
        System.out.println("Value of I : " + prot.GetX() + ";" + prot.GetY() );
        System.out.println("Value of 2 : " + prot2.GetX() + ";" + prot2.GetY() );

        System.out.println("Value of I : " + tempProt.GetCoord().x + " ; " + tempProt.GetCoord().y );
        System.out.println("Value of 2 : " + tempProt2.GetCoord().x + " ; " + tempProt2.GetCoord().y );

        PublisherBox pubBox = new PublisherBox();
        IElement elem1 = new Subscrib("Elem 1");
        IElement elem2 = new Subscrib("Elem 2");
        IElement elem3 = new Subscrib("Elem 3");
        pubBox.Register(elem1);
        pubBox.Add();
        pubBox.Notify("Notified 1");
        pubBox.Register(elem2);
        pubBox.Register(elem3);
        pubBox.Notify("Notified 2");
        pubBox.DeRegister(elem2);
        pubBox.Notify("Notified 3");
    }
    private void Procedure() {
        Proto prot = new Proto();
        Proto tempProt = new Proto();
        Prototype.Coord coord = new Prototype.Coord();
        coord.x = 20;
        coord.y = 30;
        tempProt.SetCoord(coord);
        Prototype tempProt2 = tempProt.Clone();
        Prototype.Coord coord2 = new Prototype.Coord();
        coord2.x = 40;
        coord2.y = 40;
        coord.x = 100;
        tempProt2.SetCoord(coord2);
        prot.SetX(20);
        prot.SetY(30);
        Prototype prot2 = prot.Clone();
        prot.SetX(40);
        prot.SetY(40);
        System.out.println("Value of I : " + prot.GetX() + ";" + prot.GetY() );
        System.out.println("Value of 2 : " + prot2.GetX() + ";" + prot2.GetY() );

        System.out.println("Value of I : " + tempProt.GetCoord().x + " ; " + tempProt.GetCoord().y );
        System.out.println("Value of 2 : " + tempProt2.GetCoord().x + " ; " + tempProt2.GetCoord().y );

        PublisherBox pubBox = new PublisherBox();
        IElement elem1 = new Subscrib("Elem 1");
        IElement elem2 = new Subscrib("Elem 2");
        IElement elem3 = new Subscrib("Elem 3");
        pubBox.Register(elem1);
        pubBox.Add();
        pubBox.Notify("Notified 1");
        pubBox.Register(elem2);
        pubBox.Register(elem3);
        pubBox.Notify("Notified 2");
        pubBox.DeRegister(elem2);
        pubBox.Notify("Notified 3");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Logic logic = new Logic();
        logic.Procedure();

        setContentView(R.layout.activity_main);
    }
}
