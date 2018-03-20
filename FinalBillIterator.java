/* Final Bill class that will override the methods of iterator interface
Name : Samrat Banerjee
Date : 9-8-2018 */



public class FinalBillIterator implements Iterator
{
    int pos=0;
    public FinalOrder finalOrder;
    // public FinalIterator finalIterator;

    FinalBillIterator()
    {
        finalOrder=new FinalOrder();
        //finalIterator=new FinalIterator();

    }

    public boolean hasNext()
    {
        //if(pos<finalIterator.coffee.size())
        if(pos<finalOrder.FinalBill.size())
        {
            return true;
        }
        return false;
    }

    public Object next()
    {
        if(this.hasNext())
        {
          return finalOrder.FinalBill.get(pos++);
          //return finalIterator.coffee.get(pos++);
        }
        return null;
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
