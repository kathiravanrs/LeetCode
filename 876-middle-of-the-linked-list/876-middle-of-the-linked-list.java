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
    public ListNode middleNode(ListNode h) {
        int c = 0;
        ListNode head= h;
        while(head!=null){
            c++;
            
            head = head.next;
        }
        int m = c/2;
        System.out.println(m);
        while(m>0){
            h = h.next;
            m--;
        }
        return h;
    }
}