package org.example;

public class Main {
    public static void main(String[] args) {

        BasePizza basePizza=new ChickenTikka(new ExtraCheese(new ExtraCheese(new PepperoniPizza())));
        System.out.println(basePizza.getDescription()+" ,"+"Cost : "+basePizza.getCost());
    }
}