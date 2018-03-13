package sample;

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