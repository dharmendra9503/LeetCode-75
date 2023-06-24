package LinkedList;

public class DeleteTheMiddleNodeOfLinkedList {

    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null)
            return null;
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = slow.next;
        return head;
    }

    public static void main(String[] args) {
        System.out.println("Delete the Middle Node of a Linked List");
    }
}
