package org.example;

public class FarmhousePizza extends BasePizza{

    public FarmhousePizza(){
        desription="FarmHouse Pizza";
    }

    @Override
    public int getCost(){
        return 550;
    }
}
