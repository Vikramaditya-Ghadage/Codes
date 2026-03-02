package Interview.Collections.Heap;

import java.util.*;

public class MinMax {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(5,3,1,2,7,4,6);
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.size();i++)
        {
            minHeap.add(nums.get(i));
            maxHeap.add(nums.get(i));
        }

        System.out.println("Min elements:"+minHeap.peek()); // peek
        System.out.println("Max elements:"+maxHeap.peek());

        System.out.println("Min elements:"+minHeap.poll()); // peek and remove
        System.out.println("Max elements:"+maxHeap.poll()); // peek and remove

        
        System.out.println("Min elements:"+minHeap.peek()); // peek
        System.out.println("Max elements:"+maxHeap.peek()); // peek

        // System.out.println(minHeap.re);


    }
    
}
