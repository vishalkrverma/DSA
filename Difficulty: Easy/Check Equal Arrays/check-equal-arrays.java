class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        // code here
        Map<Integer,Integer> map1=new HashMap<>();
        Map<Integer,Integer> map2=new HashMap<>();
        for(int num:a){
            map1.put(num,map1.getOrDefault(num,0)+1);
        }
        for(int num:b){
            map2.put(num,map2.getOrDefault(num,0)+1);
        }
        
        for(int i:b){
            if(map1.get(i)!=map2.get(i)) return false;
        }
        return true;
    }
}