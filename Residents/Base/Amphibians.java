package Seminar2OOP_Homework.Residents.Base;

import Seminar2OOP_Homework.Residents.Base.AquaResidents;

public abstract class Amphibians extends AquaResidents {

    public Amphibians(String type, String name) {
        super(type, name);
    }

    @Override
    public String feed() {
        return "- I like to eat something which can move.";
    }
}
