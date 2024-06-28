import java.util.*;
class ArraysAllFunctions
{
    public static void main(String []args)
    {
        int arr[]={5,4,8,1,2,9,3};
        Arrays.sort(arr);
        for(int i:arr)
        System.out.println(i);
        System.out.println("Found at:"+Arrays.binarySearch(arr,9));
    }
}