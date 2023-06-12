package Seminar2OOP_Homework.Residents;

import Seminar2OOP_Homework.Residents.Base.HerbivorousFish;

public class ClownFish extends HerbivorousFish {
    public ClownFish(String type, String name) {
        super(type, name);
    }

    @Override
    public String sound() {
        return "ClownFish says:\t\t Blop-wa-ha-ha-blop";
    }
}

    
