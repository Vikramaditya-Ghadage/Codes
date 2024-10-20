import java.util.*;
class Permutation {
    public static void permutation(List<Integer> nums,int index)
    {
        if(index>=nums.size())
        {
            System.out.println();
            nums.forEach(System.out::print);
            return;
        }
        
        for(int j=index;j<nums.size();j++)
        {
            Collections.swap(nums,j,index);
            permutation(nums,index+1);
            Collections.swap(nums,j,index);
        }
    }
    
    public static void main(String[] args) {
       List<Integer> nums=Arrays.asList(1,2,3);
       permutation(nums,0);
    }
}
