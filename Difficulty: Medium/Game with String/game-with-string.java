class Solution {
    public int minValue(String s, int k) {
        // code here
        Map<Character,Integer> map=new TreeMap<>();
        
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        
        for(int freq:map.values()){
            maxHeap.offer(freq);
        }
        
    // Jo bada wala hoga ohh lhud hi upper aa jayega.....aur usme se value -1 kr denge
        while(k>0 && !maxHeap.isEmpty()){
            int top=maxHeap.poll();
            top--;
            k--;
            
            if(top>0){
                maxHeap.offer(top);
            }
        }
        int sum=0;
        while(!maxHeap.isEmpty()){
            int val=maxHeap.poll();
            sum+=val*val;
        }
        return sum;
        
    }
}