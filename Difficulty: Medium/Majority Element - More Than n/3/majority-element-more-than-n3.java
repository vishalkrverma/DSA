class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        ArrayList<Integer> al=new ArrayList<>();
        
        Map<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
        
        int req=n/3;
        
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:map.keySet()){
            if(map.get(num)>req){
                al.add(num);
            }
        }
        Collections.sort(al);
        return al;
    }
}