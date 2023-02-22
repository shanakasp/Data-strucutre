import java.sql.Array;

public class printElementOfArraya {

    public void printArray(int[] arr)
    {
        int n = arr.length;
        for(int i =0; i  <n ; i++)
        {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String [] args)
    {
        printElementOfArraya arrayUtil = new printElementOfArraya();
        arrayUtil.printArray(new int[] {1,2,3,4,5});
    }
}
