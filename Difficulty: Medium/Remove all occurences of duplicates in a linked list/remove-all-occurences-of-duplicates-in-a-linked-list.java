class Solution {
    public Node removeAllDuplicates(Node head) {
        // code here
        
        if(head==null || head.next==null) return head;
        
        Node temp=head;
        
        HashMap<Integer,Integer> map=new LinkedHashMap<>();
        
        while(temp!=null){
            int d=temp.data;
            map.put(d,map.getOrDefault(d,0)+1);
            temp=temp.next;
        }
        
        Node dummy=new Node(0);
        Node res=dummy;
        
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                dummy.next=new Node(entry.getKey());
                dummy=dummy.next;
            }
        }
        return res.next;
    }
}