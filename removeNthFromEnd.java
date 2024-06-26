class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       if (head == null || n <= 0) {
            return null;
        }

        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode slow = temp;
        ListNode fast = temp;

        for (int i = 0; i < n; i++) {
            if (fast == null) {
                return null;
            }
            fast = fast.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

        return temp.next;
    } 
}
