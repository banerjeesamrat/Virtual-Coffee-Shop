package sample;


import java.util.ArrayList;


public class FinalOrder implements Intermediate {

    public static ArrayList<Coffee> FinalBill = new ArrayList<>();

    public FinalOrder() {


    }

    public Iterator getIterator() {
        return new FinalBillIterator();
    }

    void addToList(Coffee coffee) {
        FinalBill.add(coffee);
    }



    void orderQuantity() {
        System.out.println("\n Size of list " + FinalBill.size());
    }

    void clear() {
        FinalBill.clear();
    }
}