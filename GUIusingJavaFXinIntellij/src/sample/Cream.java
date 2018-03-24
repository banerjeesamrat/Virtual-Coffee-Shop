package sample;

/* If you look back at the our class diagram, you’ll see we’ve now written our abstract component (Coffee),
  we have our concrete components (Filter and Instant), and we have our abstract decorator (AddOnDecorator).
  Now it’s time to implement the concrete decorators.
*/

//Cream is decorator so it extends AddOnDecorator and AddOnDecorator extends Coffee
public class Cream extends AddOnDecorator{
    Coffee coffee;                        //Instantiating Cream with a reference to a Coffee

    public Cream(Coffee coffee){
        this.coffee=coffee;
    }

    public String getDescription(){
        return coffee.getDescription()+ ", Cream";
    }

    public double cost(){
        return 25+coffee.cost();            //Add the cost of the decorator with the coffee
    }
}