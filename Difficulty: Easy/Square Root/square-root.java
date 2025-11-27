class Solution {
    int floorSqrt(int n) {
       
       int i=1;
       while(i*i<=n){
           
         if((i+1)*(i+1)>n){
            return i;
         }  
           i++;
       }
        return i;
    }
}