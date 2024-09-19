package org.example;

public abstract class BasePizza {
    String desription="Unknown Pizza";
    public String getDescription(){
        return desription;
    }

    public abstract int getCost();
}
