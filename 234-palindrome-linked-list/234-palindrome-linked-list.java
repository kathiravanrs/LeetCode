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
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }
        List<Integer> list2 = new ArrayList<>(list);
        Collections.reverse(list2);
        return list2.equals(list);
    }
}