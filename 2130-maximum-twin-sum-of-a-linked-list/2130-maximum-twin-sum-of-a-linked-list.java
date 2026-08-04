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
    public ListNode rev(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode next=null;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public int pairSum(ListNode head) {
        ListNode slow=head,
                fast=head;
        

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        slow=rev(slow);

        ListNode n1=head,
            n2=slow;

        int sum=0;
        int max=0;
        while(n2!=null){
            sum=n1.val+n2.val;
            n1=n1.next;
            n2=n2.next;
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}