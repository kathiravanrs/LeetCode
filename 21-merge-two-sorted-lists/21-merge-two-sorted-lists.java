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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode merged = new ListNode();
        ListNode ref = merged;
        
        while (list1 != null && list2 != null) {
        
            if (list1.val < list2.val) {
                ref.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                ref.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            ref = ref.next;
        }
        if(list1==null){
            ref.next = list2;
        }
        if(list2==null) ref.next = list1;
        return merged.next;
    }
}
