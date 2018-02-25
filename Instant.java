
//Extending the Coffee class and implementing it
public class Instant extends Coffee{
  public Instant(){
    description="Instant";              //description instance variable is inherited from Coffee class
  }
  public double cost(){                 //cost method implemented here
    return 50;
  }
}
