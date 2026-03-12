package fixed;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class MaxAndMinFromEachWindow {

    public static void calMax(List<Integer> nums,int k)
    {
        int lb=0,ub=0;
        
        PriorityQueue<Integer> minHeap=new PriorityQueue<Integer>();
        PriorityQueue<Integer> maxHeap=new PriorityQueue<Integer>(Collections.reverseOrder());

        for(ub=0;ub<nums.size();ub++)
        {
            minHeap.add(nums.get(ub));
            maxHeap.add(nums.get(ub));

            if(ub-lb+1==k)
            {
                System.out.println(minHeap.peek()+" "+maxHeap.peek());
                minHeap.remove(nums.get(lb));
                maxHeap.remove(nums.get(lb));
                lb++;
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(1,9,-5,4,-8,7,6);
        calMax(nums,3);
    }
}
