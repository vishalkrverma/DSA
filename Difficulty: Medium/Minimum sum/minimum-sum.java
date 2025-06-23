class Solution {
    public String addString(StringBuilder sb1,StringBuilder sb2){
        int carry=0;
        int i=sb1.length()-1;
        int j=sb2.length()-1;
        
        StringBuilder res=new StringBuilder();
        while(i>=0 || j>=0 || carry>0){
            int sum=carry;
            if(i>=0){
                sum+=(sb1.charAt(i)-'0');
                i--;
            }
            if(j>=0){
                sum+=(sb2.charAt(j)-'0');
                j--;
            }
            res.append(sum%10);
            carry=sum/10;
        }
        while(res.length()>0 && res.charAt(res.length()-1)=='0'){
            res.deleteCharAt(res.length()-1);
        }
        res.reverse();
        return res.toString();
    }
    
    
    String minSum(int[] arr) {
      Arrays.sort(arr);
      StringBuilder sb1=new StringBuilder();
      StringBuilder sb2=new StringBuilder();
      
      for(int i=0;i<arr.length;i++){
          if(i%2==0){
              sb1.append(arr[i]);
          }
          else{
              sb2.append(arr[i]);
          }
      }
        return addString(sb1,sb2);
    }
}
