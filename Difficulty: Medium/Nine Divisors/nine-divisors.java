class Solution {
    
    public static List<Integer> getPrime(int n){
        boolean[] isPrime=new boolean[n+1];
        
        Arrays.fill(isPrime,true);
        isPrime[0]=isPrime[1]=false;
        
        for(int i=2;i*i<=n;i++){
            if(isPrime[i]){
                for(int j=i*i;j<=n;j+=i){
                    isPrime[j]=false;
                }
            }
        }
        List<Integer> prime=new ArrayList<>();
        
     
            for(int i=2;i<=n;i++){
                if(isPrime[i]) prime.add(i);
            }
        return prime;
    }
    
    
    
    public static int countNumbers(int n) {
        // code here
        int limit=(int)Math.sqrt(n);
        
        List<Integer> prime=getPrime(limit);
        
        int count=0;
        
        for(int p:prime){
            long num=(long)Math.pow(p,8);
            if(num<=n) count++;
    }
    
    int size=prime.size();
    for(int i=0;i<size;i++){
        long p2=(long)prime.get(i)*prime.get(i);
        
        for(int j=i+1;j<size;j++){
            long q2=(long) prime.get(j)*prime.get(j);
            long product=p2*q2;
            
            if(product<=n){
                count++;
            }
            else{
                break;
            }
        }
    }
    return count;
    }
}