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
    public ListNode deleteMiddle(ListNode head) {
        ListNode copy = head;
        int l = 0;
        while(copy!=null){
            l++; copy = copy.next;
        }
        if(l<2) return null;
        if(l==2) return new ListNode(head.val);
        copy = head;
        int p = 0;
        while(p!=l/2){
            copy = copy.next;
            p++;
        }
        if(copy.next ==null) copy = null;
        else{
            copy.val = copy.next.val;
        copy.next = copy.next.next;}
        return head;
    }
}