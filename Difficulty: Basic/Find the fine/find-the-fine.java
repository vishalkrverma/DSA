// User function Template for Java

class Solution {

    public long totalFine(int date, int car[], int fine[]) {
        // code here
       int sum=0;
        int rem=date%2;
        for(int i=0;i<car.length;i++){
           if(car[i]%2!=rem){
               sum+=fine[i];
           }
        }
        return sum;
    }
}