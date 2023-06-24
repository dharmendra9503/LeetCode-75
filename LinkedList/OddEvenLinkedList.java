package LinkedList;

public class OddEvenLinkedList {
    //Solution - 1
    /*
    public ListNode oddEvenList(ListNode head) {

        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);

        int cnt = 1;
        ListNode curr1 = dummy1;
        ListNode curr2 = dummy2;

        while(head != null){
            if(cnt%2 == 0){
                curr2.next = head;
                curr2 = curr2.next;
            }
            else{
                curr1.next = head;
                curr1 = curr1.next;
            }

            head = head.next;
            cnt++;
        }

        curr2.next = null;
        curr1.next = dummy2.next;
        return dummy1.next;
    }
    */

    //Solution - 2
    public ListNode oddEvenList(ListNode head) {

        if(head==null) return head;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while(even!=null && even.next!=null){
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;
    }

    public static void main(String[] args) {
        System.out.println("Odd Even Linked List");
    }
}
