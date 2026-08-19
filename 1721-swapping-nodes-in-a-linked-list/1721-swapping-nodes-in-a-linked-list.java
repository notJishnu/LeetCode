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
    public ListNode swapNodes(ListNode head, int k) {
        int size=0;
        ListNode curr=head;
        while(curr!=null){
            size++;
            curr=curr.next;
        }
        curr=head;
        int counter=0;
        while(counter<k-1){
            counter++;
            curr=curr.next;
        }
        ListNode n1=curr;
        curr=head;
        counter=0;
        while(counter<size-k){
            counter++;
            curr=curr.next;
        }
        ListNode n2=curr;

        int temp=n1.val;
        n1.val=n2.val;
        n2.val=temp;

        return head;
    }
}