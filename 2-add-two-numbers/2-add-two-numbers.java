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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addNumbers(l1, l2, 0);
    }
    
    ListNode addNumbers(ListNode l1, ListNode l2, int carry){
        if((l1 !=null) && (l2!=null)){
            int sum = l1.val + l2.val + carry;
            return new ListNode((sum%10), addNumbers(l1.next, l2.next, sum/10));
        }
        else if(l1==null){
            return addNodeCarry(l2, carry);
        }
        else if(l2 == null){
            return addNodeCarry(l1, carry);
        }
        else if(l2 == null && l1==null){
            if(carry == 1){
                return new ListNode(1);
            }
            else return null;
        }
        return null;   
    }
    
    ListNode addNodeCarry(ListNode l1, int carry){
        if(l1==null){
            if(carry==0) return null;
            else return new ListNode(1);
        }
        else if(carry == 0){
            return l1;
        }
        else{
            int value = l1.val+carry;
            if(value>9){
                if(l1.next == null) {
                    if(value<10){
                    return new ListNode(value);
                    }
                    else {
                        return new ListNode(value%10, new ListNode(1, null));
                    }
                }
                else return new ListNode(value%10, addNodeCarry(l1.next, 1));
            }
            else{
                return new ListNode(value, l1.next);
            }
        }
    }

}