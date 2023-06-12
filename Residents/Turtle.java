package Seminar2OOP_Homework.Residents;

import Seminar2OOP_Homework.EatingFish;
import Seminar2OOP_Homework.Residents.Base.Amphibians;

public class Turtle extends Amphibians implements EatingFish {

    public Turtle(String type, String name) {
        super(type, name);
    }

    @Override
    public String sound() {
        return "Turtle says:\t\t I don't know any Splinter!";
    }

    @Override
    public int eatedFishes() {
        return 60;
    }
}

    
