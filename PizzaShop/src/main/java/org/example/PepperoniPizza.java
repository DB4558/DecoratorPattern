package org.example;

public class PepperoniPizza extends BasePizza{
    public PepperoniPizza(){
        desription="Pepperoni Pizza";
    }

    @Override
    public int getCost(){
        return 700;
    }
}
