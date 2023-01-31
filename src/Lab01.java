public class Lab01 {
    public static void main(String[] args)
    {
        noDuparray X = new noDuparray(10);
        X.insert(4);
        X.display();
    }
}

class noDuparray{
    private long[] a; //reference to array
    private int nElements; //number of data items

    public noDuparray(int max)
    {
        this.a = new long[max];
        this.nElements=0;
    }

    public boolean find(long SearchKey)
    {
        for (int i=0; i< this.nElements; i++)
        {
            if(a[i] == SearchKey)
            {
                return true;
            }
        }
        return false;
    }

    public void insert(long value)
    {
        if (nElements==a.length)
        {
            System.out.println("This array is full");
            return;
        }
        boolean status=find(value);
        if (find(value))
        {
            System.out.println("Value duplicated");
        }
        else
        {
    this.a[nElements] = value;
    this.nElements++;
    System.out.println("Value Inserted");
    }
}

public boolean delete(long value)
{
    if (nElements==0)
    {
        System.out.println("Array is empty deletion terminated");
        return false;

    }
    for (int i =0; i< this.nElements;i++)
    {
        if (this.a[i] == value)
            for(int j =1; j < nElements-1; i++)
            {
                a[j] = a[j+1];
            }
        nElements--;
        System.out.println("Value deleted");
        return true;
    }

     System.out.println("Value not found for deletion");
    return false;

}

public void display()
{
    for (int i=0; i<nElements; i++)
    {
        System.out.println(a[i] + " ");
    }
    System.out.println();
}
}