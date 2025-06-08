import java.math.BigInteger;
class Solution {
    public boolean isSumString(String s) {
        int n=s.length();
        if(n<3) return false;
        
        for(int i=1;i<n;i++){
            for(int j=i+1;j<n;j++){
                String first=s.substring(0,i);
                String second=s.substring(i,j);
                String third=s.substring(j);
                
                if(isValid(first,second,third)){
                    return true;
                }
            }
        }
        return false;
    }
    private static boolean isValid(String first,String second,String third){
        if((first.length()>1 && first.charAt(0)=='0')||
        (second.length()>1 && second.charAt(0)=='0')){
            return false;
        }
        BigInteger num1=new BigInteger(first);
        BigInteger num2=new BigInteger(second);
        String sum=num1.add(num2).toString();
        
        if(!third.startsWith(sum)){
            return false;
        }
        if(third.equals(sum)){
            return true;
        }
        return isValid(second,sum,third.substring(sum.length()));
        
    }
}