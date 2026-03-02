package SDE_SHEET_JAVA.Array3;

public class TwoDimArraySearch {

    public static void findElement(int [][] nums,int target)
    {
        int m=nums.length;
        int n=nums[0].length;
        int lb=0,ub=(m*n)-1;

        while(lb<=ub)
        {
            int mid=(lb+ub)/2;  // Always use low + (high - low) / 2 in binary search. Your original code works for small arrays but crashes silently on large inputs.
            int row=mid/m,col=mid%n;

            if(nums[row][col]==target)
            {
                System.out.println("Element found at:"+ row +" "+col);
                return;
            }
                
            else if(nums[row][col]<target)
                lb=mid+1;
            else
                ub=mid-1;
        }
        System.out.println("Element not found");
    }
    public static void main(String args[])
    {
        int [][] nums={{1,2,3},{4,5,6},{7,8,9}};
        findElement(nums,-11);

    }
    
}
