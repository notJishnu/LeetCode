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
    public void reorderList(ListNode head) {
        ListNode slow=head,
            fast=head;

        while(fast!=null && fast.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode prev=null;
        ListNode curr=slow;

        while(curr!=null){
            ListNode next=curr.next;

            curr.next=prev;
            prev=curr;
            curr=next;
        }
        slow=head;

        while(prev.next!=null){
            ListNode temp1=slow.next;
            ListNode temp2=prev.next;
            slow.next=prev;
            prev.next=temp1;
            slow=temp1;
            prev=temp2;
            
        }
        

    }
}