//Question link - https://leetcode.com/problems/remove-linked-list-elements/description/

//Time complexity - O(n)

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)
        {
            return null;
        }
        head.next=removeElements(head.next,val);
        if (head.val == val)
        {
            return head.next;
        }    
        else 
        {
            return head;
        }
    }        
}
