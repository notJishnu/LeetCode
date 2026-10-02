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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return head;
        }
        ListNode curr = head;
        int count = 0;
        ListNode tail=null;
        while (curr != null) {
            tail=curr;
            curr = curr.next;
            count++;
        }
        int jump=count-(k % count);
        int i=1;
        ListNode temp=head;
        while(i<jump){
            temp=temp.next;
            i++;
        }
        tail.next=head;
        ListNode newHead=temp.next;
        temp.next=null;
        return newHead;
    }
}