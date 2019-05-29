public class ReverseLinkedList {

    public static void reverseThreePointer(FindMiddleInLinkedList.ListNode head){
        FindMiddleInLinkedList.ListNode previous = null;
        FindMiddleInLinkedList.ListNode currunt = head;
        FindMiddleInLinkedList.ListNode next = null;

        while (currunt!=null){
            next = currunt.next;
            currunt.next = previous;
            previous = currunt;
            currunt = next;
        }
        head = previous; // print linkedList This is important

    }

        public static void main(String args[]){
            FindMiddleInLinkedList.ListNode head = new FindMiddleInLinkedList.ListNode(1);
            head.next = new FindMiddleInLinkedList.ListNode(2);
            head.next.next = new FindMiddleInLinkedList.ListNode(3);
            head.next.next.next = new FindMiddleInLinkedList.ListNode(4);
            head.next.next.next.next = new FindMiddleInLinkedList.ListNode(5);
            head.next.next.next.next = new FindMiddleInLinkedList.ListNode(6);
            head.next.next.next.next.next = new FindMiddleInLinkedList.ListNode(7);
            reverseThreePointer(head);
        }



}
