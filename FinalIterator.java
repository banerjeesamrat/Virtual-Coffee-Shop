 /* Bill class will implement intermediate class. This class will provide the functionality for methods.
Iterator->Intermediate->FinalIterator->FinalBill
Name : Samrat Banerjee
Date : 9-3-2017 */



import java.util.ArrayList;


class FinalIterator implements Intermediate
{

    ArrayList<String> coffee=new ArrayList<>();

    FinalIterator()
    {
        coffee.add("Cappuccino");
        coffee.add("Frappe");
        coffee.add("Espresso");
        coffee.add("Americano");
    }

    
}
