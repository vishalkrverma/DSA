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
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode curr=head;

        while(curr!=null){
            int cnt=0;
            ListNode start=curr;

            while(cnt<k && curr!=null){
                  curr=curr.next;
                cnt++;
            }
            if(cnt==k){
                ListNode node=start;

                ListNode[] arr=new ListNode[k];

                for(int i=0;i<k;i++){
                    arr[i]=node;
                    node=node.next;
                }
                int i=0;
                int j=k-1;
                while(i<j){
                    int temp=arr[i].val;
                    arr[i].val=arr[j].val;
                    arr[j].val=temp;
                    i++;
                    j--;
                }
            }
        }
        return head;
    }
}