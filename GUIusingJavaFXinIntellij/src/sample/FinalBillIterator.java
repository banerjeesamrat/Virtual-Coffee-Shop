package sample;

public class FinalBillIterator implements Iterator{

    double bill=0;


    int pos=0;

    public sample.FinalOrder finalOrder;

    FinalBillIterator()
    {
        finalOrder=new sample.FinalOrder();

    }

    public boolean hasNext()
    {

        if(pos<finalOrder.FinalBill.size())
        {
            return true;
        }
        return false;
    }

    public Object next()
    {
        while(this.hasNext())
        {
            bill = bill + finalOrder.FinalBill.get(pos++).cost();


        }

        return bill;
    }

    public void remove()
    {
        if(pos<0)
        {
            System.out.println("Illegal pos");
        }
        try
        {
            if(this.next()!=null)
            {
                System.out.println("In remove");
                finalOrder.FinalBill.remove(pos);
            }
        }
        catch(Exception e)
        {
            //Handle exception
        }
    }
}
