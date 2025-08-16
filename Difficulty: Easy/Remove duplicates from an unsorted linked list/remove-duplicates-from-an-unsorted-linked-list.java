/* The structure of linked list is the following
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    // Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) {
        // Your code here
        if(head==null) return head;
        HashSet<Integer> set=new HashSet<>();
        Node curr=head;
        Node prev=null;
        
        while(curr!=null){
            if(set.contains(curr.data)){
                prev.next=curr.next;
            }
            else{
                set.add(curr.data);
                prev=curr;
            }
            curr=curr.next;
        }
        return head;
    }
}