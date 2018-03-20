/*
Project: Virtual Coffee Shop
Author: Samrat Banerjee, Furkan Bilal Memon, Rohan Talpade
Date: 25/02/2018
*/

import java.util.ArrayList;


public class FinalOrder implements Intermediate{

  public static ArrayList<Coffee> FinalBill=new ArrayList<>();
  public FinalOrder()
  {
//    FinalBill=new ArrayList<>();
    //
  }
  public Iterator getIterator()
    {
          return new FinalBillIterator();
    }

  void addToList(Coffee coffee)
  {
      FinalBill.add(coffee);
  }

  // void printList()
  // {
  //   for(Coffee c:FinalBill)
  //   {
  //       System.out.println(c.cost());
  //       System.out.println(c.getDescription());
  //   }
  // }

  void orderQuantity()
  {
      System.out.println("\n Size of list "+FinalBill.size());
  }
    
  void clear()
  {
      FinalBill.clear();
  }

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

    //public ArrayList FinalBill=new ArrayList();
    // FinalBill.add(coffee);
    // FinalBill.add(coffee1);
    // FinalBill.add(coffee2);
    FinalOrder it=new FinalOrder();

    it.addToList(coffee2);
    it.addToList(coffee1);
    it.addToList(coffee);
    //it.printList();
    //System.out.println("\n Traversing via iterator");
    it.orderQuantity();
    System.out.println("-------------------------");
    Iterator iterator=it.getIterator();
    while(iterator.hasNext())
    {
        System.out.println("\n Variety of coffee provided by us are");
        Coffee coffeeIt=(Coffee)iterator.next();
        System.out.println("\n Name of coffee "+coffeeIt.getDescription()+"\n Cost of Coffee "+coffeeIt.cost());
        //System.out.println(iterator.next());
    }
    
    System.out.println("\n Removing elements..");
    while(iterator.hasNext())
    {
        iterator.remove();
    }
    System.out.println("\n Done..");
    it.orderQuantity();
  }
}
