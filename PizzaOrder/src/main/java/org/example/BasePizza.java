package org.example;

public abstract class BasePizza {
    String description="Unknown Pizza";
    public String getDescription(){
        return description;
    }

    public abstract int getCost();
}
