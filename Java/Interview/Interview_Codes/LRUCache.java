import java.util.*;
import java.util.Map;

public class LRUCache  {

  
    private static class Node
    {
        int value;
        Node prev;
        Node next;

        Node(int value){this.value=value;}

    }

    private final int capacity;
    private HashMap<Integer,Node> map;

    Node head=new Node(-1);
    Node tail=new Node(-1);

    LRUCache(int capacity)
    {
        this.capacity=capacity;


        head.next=tail;
        tail.prev=head;
        map = new HashMap<>();
    }

    public void put(int value)
    {
        Node node=new Node(value);

        if(head.value==-1)
        {
            head.value=value;
            map.put(value,node);
            return;
        }


        if(tail.value==-1)
        {
            tail.value=value;
            map.put(value,node);
            return;
        }
        
        if(map.size()==capacity)
        {
            removeFirst();
        }

        addNodeLast(node);

    }

    void addNodeLast(Node node)
    {
        node.prev=tail;
        tail.next=node;
        tail=tail.next;

        map.put(node.value,node);
    }

    void removeFirst()
    {
        map.remove(head.value);
        head=head.next;
        head.prev=null;
 
    }

    void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.value);
            temp=temp.next;
        }

    }

    // Demo
    public static void main(String[] args) {

        LRUCache cache = new LRUCache(3);

        List<Integer> values = Arrays.asList(1,2,3,4,1,2,3,4,5);

        for (int i : values) {
            cache.put(i);
            System.out.print("  LRU Cache After Putting->"+i+" : ");
            cache.print();   // print after every add
            System.out.println();
        }
    }
}