/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        int sum = curr1.val + curr2.val;
        sum = (sum > 9)? sum - 10: sum;
        int carry = ((curr1.val + curr2.val) > 9)? 1: 0;
        ListNode res = new ListNode(sum);
        ListNode curr = res; 

        curr1 = curr1.next;
        curr2 = curr2.next;
        /*non reaches the end*/

        while(curr1 != null && curr2 != null) {
          sum = curr1.val + curr2.val + carry;
          if (sum > 9){
            sum -= 10;
            carry = 1;
          }else{
            carry = 0;
          }
          curr.next = new ListNode(sum);
          curr = curr.next;
          curr1 = curr1.next;
          curr2 = curr2.next;
        }

        if (curr1 == null){
          while (curr2 != null){
            sum = curr2.val + carry;
            if (sum > 9){
              sum -= 10;
              carry = 1;
            }else{
              carry = 0;
            }
            curr.next = new ListNode(sum);
            curr = curr.next;
            curr2 = curr2.next;
          }
        }else if (curr2 == null){
          while (curr1 != null){
            sum = curr1.val + carry;
            if (sum > 9){
              sum -= 10;
              carry = 1;
            }else{
              carry = 0;
            }
            curr.next = new ListNode(sum);
            curr = curr.next;
            curr1 = curr1.next;
          }
        }

        if (carry == 1){
          curr.next = new ListNode(carry);
          curr = curr.next;
        }
        return res;
    }
}
