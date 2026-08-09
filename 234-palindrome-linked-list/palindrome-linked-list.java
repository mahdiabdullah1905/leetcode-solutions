/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode node = head;
        ListNode mid = middle(head);
        mid = reverselinkedlist(mid);

        while(mid!=null){
            if(node.val != mid.val){
                return false;
            }
            node = node.next;
            mid = mid.next;
        }

        return true;

        
    }

    public static ListNode middle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast!= null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static ListNode reverselinkedlist(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = curr.next;

        while(curr != null){
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next!=null){
            next = next.next;}
        }
        return prev;
    }
}