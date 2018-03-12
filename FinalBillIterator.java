/* Final Bill class that will override the methods of iterator interface
Name : Samrat Banerjee
Date : 9-8-2018 */



public class FinalBillIterator implements Iterator
{
    int pos=0;
    public FinalIterator finalIterator;

    FinalBillIterator()
    {
        finalIterator=new FinalIterator();
    }

    public boolean hasNext()
    {
        if(pos<finalIterator.coffee.size())
        {
            return true;
        }
        return false;
    }

    public Object next()
    {
        if(this.hasNext())
        {
          return finalIterator.coffee.get(pos++);
        }
        return null;
    }
}
