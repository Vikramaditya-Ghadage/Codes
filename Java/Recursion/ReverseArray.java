import java.util.*;
class ReverseArray
{
    static int arr[]={1,5,4,2,6,7,9,0,8};
    public static void swap(int arr[],int i,int j)
    {
       
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    public static void reverse(int arr[],int l,int n)
    {
        System.out.println(l+"  "+n);
        if(l>=n)
        return;
        swap(arr,l,n);
        reverse(arr,l+1,n-1);

    }
    public static void main(String args[])
    {
        
        // int j=arr.length-1;
        // for(int i=0;i<arr.length/2;i++)
        // {
        //     int t=arr[i];
        //     arr[i]=arr[j];
        //     arr[j]=t;
        //     j--;
        // }
        reverse(arr,0,arr.length-1);
        for(int i:arr)
        System.out.println(i);

    }

}
