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
        ListNode refA = headA;
        while (refA !=null){
            ListNode refB = headB;
            while(refB!=null){
                if(refA==refB) return refA;
                refB = refB.next;
            }
            refA = refA.next;
        }
        return refA;
        
    }
}