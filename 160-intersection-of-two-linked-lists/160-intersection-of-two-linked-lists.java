/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode newNode1 = headA;
        while(newNode1!=null){
            ListNode newNode2 = headB;
            while(newNode2!=null){
                if(newNode1==newNode2){
                    return newNode2;
                }
                newNode2 = newNode2.next;
            }
            newNode1 = newNode1.next;
        }
        return null;
    }
}