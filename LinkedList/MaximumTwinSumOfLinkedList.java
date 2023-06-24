package LinkedList;

public class MaximumTwinSumOfLinkedList {

    //T.C: O(n)
    //S.C: O(n)
    /*
    public int pairSum(ListNode head) {
        List<Integer> list = new ArrayList<>();

        while(head != null) {
            list.add(head.val);
            head = head.next;
        }

        int i=0, j=list.size()-1;
        int maxSum = Integer.MIN_VALUE;
        while(i < j) {
            int sum = list.get(i) + list.get(j);
            maxSum = Math.max(maxSum, sum);
            i++;
            j--;
        }

        return maxSum;
    }
    */

    //Approach : Reverse Second Half In Place
    //T.C:O(n)
    //S.C:O(1)
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode next = null;
        ListNode prev = null;

        while(slow != null) {
            next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }


        int maxSum = Integer.MIN_VALUE;

        while(prev != null) {
            int sum = head.val + prev.val;
            maxSum = Math.max(maxSum, sum);
            head = head.next;
            prev = prev.next;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println("Maximum Twin Sum of a Linked List");
    }
}
