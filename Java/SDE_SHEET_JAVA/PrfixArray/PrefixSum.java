package SDE_SHEET_JAVA.PrfixArray;

public class PrefixSum {

    private static int [] prefixSums;
    public static int rangeSum(int left,int right)
    {
        if(left==0)
            return prefixSums[right];  // to handle prefix case

        return prefixSums[right]-prefixSums[left-1];
    }
    public static void main(String[] args) {

        int []nums={-2,0,3,-5,2,-1};
        prefixSums=new int[nums.length];

        int currentSum=0;
        
        for (int i = 0; i < nums.length; i++) {
            currentSum+=nums[i];
            prefixSums[i] = currentSum;
        }

        System.out.println();

        System.out.println(rangeSum(0,2));
        System.out.println(rangeSum(2,5));
        System.out.println(rangeSum(0,5));
        
    }
}
