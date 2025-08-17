/*Complete the function below*/

class Solution {
    public static int maxSubsetXOR(int arr[], int N) {
       int[] basis=new int[32];
       
       for(int num:arr){
           for(int i=31;i>=0;i--){
               if((num & (1<<i))==0) continue;
               
               if(basis[i]==0){
                   basis[i]=num;
                   break;
               }
               num^=basis[i];
           }
       }
       int maxXor=0;
       
       for(int i=31;i>=0;i--){
           if((maxXor^ basis[i])>maxXor){
               maxXor^=basis[i];
           }
       }
       return maxXor;
    }
}