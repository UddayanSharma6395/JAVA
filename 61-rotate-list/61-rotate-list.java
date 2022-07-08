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
        int count=1;
        ListNode node=new ListNode();
        node=head;
        if(head==null)
            return head;
        while(node.next!=null)
        {
            count++;
            node=node.next;
        }
            
        System.out.println(count);
        int c=count-k%count-1;
        node.next=head;
        node=head;
        while(c>0)
        {
            node=node.next;
            c--;
        }
        head=node.next;
        node.next=null;
        
        return head;
    }
}