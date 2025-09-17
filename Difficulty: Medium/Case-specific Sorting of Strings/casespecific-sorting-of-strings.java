class Solution {
    public static String caseSort(String str) {
        // code here
        int n=str.length();
        StringBuilder small=new StringBuilder();
        StringBuilder cap=new StringBuilder();
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                cap.append(str.charAt(i));
            }
            else{
                small.append(str.charAt(i));
            }
        }
        char[] smallLetter=small.toString().toCharArray();
        char[] capital=cap.toString().toCharArray();
        
        Arrays.sort(smallLetter);
        Arrays.sort(capital);
        StringBuilder sb=new StringBuilder();
        int j=0;
        int k=0;
        
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            
            if(ch>='A' && ch<='Z'){
                sb.append(capital[k++]);
            }
            else{
                sb.append(smallLetter[j++]);
            }
        }
        return sb.toString();
    }
}