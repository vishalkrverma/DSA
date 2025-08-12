class Solution {
    boolean pythagoreanTriplet(int[] arr) {
        // code here
        HashSet<Integer> set=new HashSet<>();
        
        for(int num:arr){
            int curr=num*num;
            set.add(curr);
        }
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum=arr[i]*arr[i]+arr[j]*arr[j];
                if(set.contains(sum)) return true;
            }
        }
        return false;
    }
}