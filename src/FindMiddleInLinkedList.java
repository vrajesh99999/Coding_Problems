import org.w3c.dom.Node;
public class FindMiddleInLinkedList {
    public static int findmiddleNormal(ListNode head){
        int result = 0;
        int length = 0;
        int middle = 0;
        ListNode start = head;
        while (start!=null){
            start=start.next;
            length++;
        }
        middle = length/2;

        while (middle!=result){
            head=head.next;
            result++;
        }
        return head.val;
    }
    public static int findmiddleTwoPointers(ListNode head){
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        while (fastPointer!=null && fastPointer.next!=null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return slowPointer.val;
    }

    public static void main(String args[]){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next = new ListNode(7);
        int result = findmiddleTwoPointers(head);
        System.out.println(result);
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
