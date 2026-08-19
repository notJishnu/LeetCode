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
        ListNode n1=head;
        int counter=0;
        while(counter<k-1){
           counter++;
            n1=n1.next;
        }
        ListNode nt1=n1;
        ListNode n2=head;
        while(nt1.next!=null){
            n2=n2.next;
            nt1=nt1.next;
        }

        int temp=n1.val;
        n1.val=n2.val;
        n2.val=temp;

        return head;
    }
}