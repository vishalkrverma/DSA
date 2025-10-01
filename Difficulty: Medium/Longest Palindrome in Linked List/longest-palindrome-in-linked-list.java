/*Complete the function below
Node is as follows:
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}*/
class Solution {
    
    private static  int count(Node a,Node b){
        int cnt=0;
        
        while(a!=null && b!=null){
            if(a.data==b.data){
                cnt++;
                a=a.next;
                b=b.next;
            }
            else{
                break;
            }
        }
        return cnt;
    }
    public static int maxPalindrome(Node head) {
        
        
        int maxLen=0;
        Node prev=null;
        Node curr=head;
        
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
           
           int oddLen=2*count(prev,next)+1;
           int evenLen=2* count(curr,next);
           
           maxLen=Math.max(maxLen,Math.max(oddLen,evenLen));
           
           prev=curr;
           curr=next;
        }
       return maxLen;
    }
}