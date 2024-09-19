package org.example;

public class ChickenTikka extends ToppingsDecorator{
    public ChickenTikka(BasePizza basePizza){
        this.pizza=basePizza;
    }

    public String getDescription(){
        return pizza.getDescription()+" ,Chicken Tikka";
    }

    public int getCost(){
        return pizza.getCost()+70;
    }
}
