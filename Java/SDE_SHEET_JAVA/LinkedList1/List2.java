import java.util.Stack;

public class List2 {

    public static void printList(ListNode head)
    {
        ListNode current=head;

        while(current!=null)
        {
            System.out.print(current.val+"->");
            current=current.next;
        }
        System.out.println();
    }

    public static boolean detectCycle(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast)
                return true;
        }

        return false;
    }

    public static boolean isPalindromicList(ListNode head)
    {
        ListNode tempNode=head;
        Stack<Integer> st=new Stack<>();

        while(tempNode!=null)
        {
            st.push(tempNode.val);
            tempNode=tempNode.next;
        }

        tempNode=head;
        while(tempNode!=null)
        {
            if(tempNode.val!=st.peek())
                return false;
            st.pop();
            tempNode=tempNode.next;
        }

        return true;
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1,new ListNode(2,new ListNode(3,
            new ListNode(2,new ListNode(1)))));

        printList(head);

        System.out.println("Detect Cycle:"+detectCycle(head));

        System.out.println("Palindrome List:"+isPalindromicList(head));

    }
    
}
