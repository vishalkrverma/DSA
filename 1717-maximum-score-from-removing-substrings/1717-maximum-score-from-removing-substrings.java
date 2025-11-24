class Solution {
    private String remaining;
    public int maximumGain(String s, int x, int y) {
        if(x>y){
            int score1=removePair(s,'a','b',x);
            return score1+ removePair(remaining,'b','a',y);
            // return score1+removePair(remaining,'b','a',y);
        }
        else{
            int score1=removePair(s,'b','a',y);
            return score1+removePair(remaining,'a','b',x);
        }
    }

    private int removePair(String s,char a,char b,int score){
        StringBuilder sb=new StringBuilder();
        int gained=0;

        for(char ch:s.toCharArray()){
            if(sb.length()>0 && sb.charAt(sb.length()-1)==a && ch==b){
                sb.deleteCharAt(sb.length()-1);
                gained+=score;
            }
            else{
                sb.append(ch);
            }
        }
        remaining=sb.toString();
        return gained;
    }
}