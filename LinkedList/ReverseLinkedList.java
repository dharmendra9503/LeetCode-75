package LinkedList;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }

        ListNode temp = head;
        ListNode next = null;
        ListNode prev = null;

        while(temp.next != null){
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }

        temp.next = prev;
        head = temp;

        return head;
    }

    public static void main(String[] args) {
        System.out.println("Reverse Linked List");
    }
}
