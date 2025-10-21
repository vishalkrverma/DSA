class Solution {
    
    public static int getSum(int[] arr){
        int sum=0;
        for(int val:arr){
            sum+=val;
        }
        return sum;
    }
    
    public static int maxEqualSum(int N1, int N2, int N3, int[] S1, int[] S2,
                                  int[] S3) {
        
        int sum1=getSum(S1);
        int sum2=getSum(S2);
        int sum3=getSum(S3);
        
        int i=0,j=0,k=0;
        
        while(i<S1.length && j<S2.length && k<S3.length){
            if(sum1==sum2 && sum2==sum3){
                return sum1;
            }
            if(sum1>=sum2 && sum1>=sum3){
                sum1-=S1[i++];
            }
            else if(sum2>=sum1 && sum2>=sum3){
                sum2-=S2[j++];
            }
            else if(sum3>=sum1 && sum3>=sum2){
                sum3-=S3[k++];
            }
        }
        return 0;
    }
}
