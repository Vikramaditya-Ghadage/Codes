import java.util.*;
class MergeSort
{
    public int nums[]={4,5,1,3,2};

    public void merge(int lower,int mid,int upper)
    {
        int n1=mid-lower+1;
        int n2=upper-mid;

        int L[]=new int[n1];
        int U[]=new int[n2];

        for(int i=0;i<n1;i++)
        L[i]=nums[lower+i];

        for(int j=0;j<n2;j++)
        U[j]=nums[mid+1+j];

        int i=0,j=0,k=lower;

        while(i<n1 && j<n2)
        {
            if(L[i]<U[j])
            {
                nums[k]=L[i];
                i++;
                k++;
            }
            else
            {
                nums[k]=U[j];
                j++;
                k++;

            }
        }

        while(i<n1)
        {
            nums[k]=L[i];
            i++;
            k++;

        }

        while(j<n2)
        {
            nums[k]=U[j];
            j++;
            k++;
        }


    }
    public void mergeSort(int lower,int upper)
    {
        if(lower<upper)
        {
            int mid=(lower+upper)/2;
            mergeSort(lower,mid);
            mergeSort(mid+1,upper);

            merge(lower,mid,upper);
        }
    }

    public void display()
    {
        for(int i:nums)
        System.out.println(i);
    }
    public static void main(String args[])
    {
        MergeSort obj=new MergeSort();
        obj.mergeSort(0,4);
        obj.display();
    }
}