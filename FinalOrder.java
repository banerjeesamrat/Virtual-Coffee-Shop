/*
Project: Virtual Coffee Shop
Author: Samrat Banerjee, Furkan Bilal Memon, Rohan Talpade
Date: 25/02/2018
*/

public class FinalOrder{

  public static void main(String[] args) {

    Coffee coffee=new Filter();
    System.out.println(coffee.getDescription()+" "+coffee.cost()+" rupees");

    Coffee coffee1=new Instant();
    coffee1=new Milk(coffee1);
    coffee1=new Milk(coffee1);
    coffee1=new Cream(coffee1);
    System.out.println(coffee1.getDescription()+" "+coffee1.cost()+" rupees");

    Coffee coffee2=new Instant();
    coffee2=new Milk(coffee2);
    coffee2=new Caramel(coffee2);
    coffee2=new Caramel(coffee2);
    coffee2=new Cream(coffee2);
    System.out.println(coffee2.getDescription()+" "+coffee2.cost()+" rupees");

  }
}
