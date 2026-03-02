class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {this.val=val;}
    ListNode(int val,ListNode next){this.val=val;this.next=next;}
}

public class List1 {
    public static ListNode reverseList(ListNode head)
    {
        ListNode previous=null;
        ListNode current=head;
        ListNode nextNode=head;

        while(current!=null)
        {
            nextNode=current.next;
            current.next=previous;
            previous=current;
            current=nextNode;
        }

        return previous;
    }

    public static void printReverse(ListNode head)
    {
        if(head==null)
            return;
        printReverse(head.next);
        System.out.print(head.val+"->");
    }
    public static ListNode findMiddle(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;

        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }
    public static void printList(ListNode head) {
        ListNode current=head;

        while(current!=null)
        {

            System.out.print(current.val+"->");
            current=current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, 
                           new ListNode(4, new ListNode(5)))));

        System.out.print("Original: ");
        printList(head);

        System.out.print("Reverse: ");
        head=reverseList(head);
        printList(head);

        ListNode middle=findMiddle(head);
        System.out.println("Middle node is:"+middle.val);

        printReverse(head);

    }
}
