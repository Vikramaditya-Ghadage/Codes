import java.util.*;
class NextPermutation {
    public static void nextPermutation(List<Integer> nums,int n)
    {
        int k=n-2;
        
        for(;k>=0;k--)
        {
            if(nums.get(k)<nums.get(k+1))
            break;
        }
        
        if(k<0)
        Collections.reverse(nums);
        else
        {
            int ub=n-1;
            for(;ub>=k;ub--)
            {
                if(nums.get(ub)>nums.get(k))
                {
                    break;
                }
            }
            
            Collections.swap(nums,k,ub);
            Collections.reverse(nums.subList(k+1,n));
        }
        
      
       
    }
    
    public static void main(String[] args) {
      List<Integer> nums=Arrays.asList(1,2,3);
      nextPermutation(nums,nums.size());
      nums.forEach(System.out::print);
       
    }
}
