
/* If you look back at the our class diagram, you’ll see we’ve now written our abstract component (Coffee),
  we have our concrete components (Filter and Instant), and we have our abstract decorator (AddOnDecorator).
  Now it’s time to implement the concrete decorators.
*/

//Milk is decorator so it extends AddOnDecorator and AddOnDecorator extends Coffee
public class Milk extends AddOnDecorator{
  Coffee coffee;                        //Instantiating Milk with a reference to a Coffee

  public Milk(Coffee coffee){
    this.coffee=coffee;
  }

  public String getDescription(){
    return coffee.getDescription()+ ", Milk";
  }

  public double cost(){
    return 15+coffee.cost();            //Add the cost of the decorator with the coffee
  }
}
