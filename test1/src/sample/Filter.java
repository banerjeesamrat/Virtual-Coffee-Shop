package sample;

//Extending the Coffee class and implementing it
public class Filter extends Coffee{
    public Filter(){
        description="Filter";               //description instance variable is inherited from Coffee class
    }
    public double cost(){                 //cost method implemented here
        return 80;
    }
}