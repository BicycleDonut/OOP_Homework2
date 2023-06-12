package Seminar2OOP_Homework;

import Seminar2OOP_Homework.EatingFish;
import Seminar2OOP_Homework.Residents.Base.AquaResidents;

public class AquaMan extends AquaResidents implements EatingFish {

    public AquaMan(String type, String name) {
        super(type, name);
    }

    @Override
    public String feed() {
        return "I like to eat foie gras.";
    }

    @Override
    public String sound() {
        return "AquaMan says:\t\t Submit, landsmen!";
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int eatedFishes() {
        return 9999;
    }
}
