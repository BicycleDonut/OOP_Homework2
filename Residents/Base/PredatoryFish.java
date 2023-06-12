package Seminar2OOP_Homework.Residents.Base;

import Seminar2OPP_Homework.EatingFish;

public abstract class PredatoryFish extends Fishes implements EatingFish {

    public PredatoryFish(String type, String name) {
        super(type, name);
    }

    @Override
    public String feed() {
        return "Blop-blop-blop.(In meaning \"I like to eat other fishes\")";
    }

}

