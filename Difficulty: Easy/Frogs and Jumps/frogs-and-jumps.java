// User function Template for Java

class Solution {
    public int unvisitedLeaves(int n, int leaves, int frogs[]) {
        // Code here
        boolean[] visited=new boolean[leaves+1];
        
        for(int i=0;i<n;i++){
            int jump=frogs[i];
            
            if(jump>leaves || visited[jump]) continue;
            
            for(int j=jump;j<=leaves;j+=jump){
                visited[j]=true;
            }
        }
        
        int cnt=0;
        
        for(int i=1;i<=leaves;i++){
            if(!visited[i]) cnt++;
        }
        return cnt;
    }
}
