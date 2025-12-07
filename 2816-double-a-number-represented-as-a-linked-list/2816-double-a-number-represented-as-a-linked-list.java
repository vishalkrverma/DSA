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

static ListNode reverse(ListNode head){
    ListNode curr=head;
    ListNode prev=null;

    while(curr!=null){
        ListNode next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    return prev;
}

    public ListNode doubleIt(ListNode head) {

        head=reverse(head);
        
        int carry=0;

        ListNode curr=head;

        while(curr!=null){
            int val=curr.val*2+carry;
            curr.val=val%10;
            carry=val/10;
        if (curr.next == null && carry > 0) {
                curr.next = new ListNode(carry);
                carry = 0;
                break;
            }
            curr = curr.next;
        }

        // Step 2: reverse back and return
        return reverse(head);
    }
}