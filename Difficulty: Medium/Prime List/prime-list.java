// User function Template for Java
/*
class Node{
    Node next;
    int val;
    public Node(int data){
        val=data;
        next=null;
    }
}
*/

class Solution {
     public Node primeList(Node head) {
        Node curr = head;

        while (curr != null) {
            curr.val = nearestPrime(curr.val);
            curr = curr.next;
        }

        return head;
    }
    private boolean isPrime(int n) {
        // code here
        if(n<=1)  return false;
        if(n==2 || n==3) return true;
        
        if(n%2==0 || n%3==0) return false;
        
        for(int i=5;i*i<=n;i+=6){
            if(n%i==0 || n%(i+2)==0) return false;
        }
        return true;
    }
    
    private int nearestPrime(int n){
        if(isPrime(n)) return n;
        
        int lower=n-1;
        int upper=n+1;
        
        
        while(true){
            if(lower >1 && isPrime(lower)) return lower;
            
            if(isPrime(upper)) return upper;
            lower--;
            upper++;
        }
    }
}