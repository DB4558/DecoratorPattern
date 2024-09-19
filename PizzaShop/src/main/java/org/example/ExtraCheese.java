package org.example;

public class ExtraCheese extends ToppingsDecorator{
    public ExtraCheese(BasePizza basePizza){
        this.pizza=basePizza;
    }

    public String getDescription(){
        return pizza.getDescription()+" ,ExtraCheese";
    }

    public int getCost(){
        return pizza.getCost()+50;
    }
}
