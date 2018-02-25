/* If you look back at the our class diagram, you’ll see we’ve now written our abstract component (Coffee),
  we have our concrete components (Filter and Instant), and we have our abstract decorator (AddOnDecorator).
  Now it’s time to implement the concrete decorators.
*/

//Caramel is decorator so it extends AddOnDecorator and AddOnDecorator extends Coffee
public class Caramel extends AddOnDecorator{
  Coffee coffee;                        //Instantiating Caramel with a reference to a Coffee

  public Caramel(Coffee coffee){
    this.coffee=coffee;
  }

  public String getDescription(){
    return coffee.getDescription()+ ", Caramel";
  }

  public double cost(){
    return 40+coffee.cost();             //Add the cost of the decorator with the coffee
  }
}
