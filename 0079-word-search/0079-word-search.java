class Solution {
static boolean valid(boolean[][] visited,char[][] board,String word,int i,int j,int idx,int n,int m){

    if(idx==word.length()) return true;

    if(i<0|| j<0 || j>=m|| i>=n || visited[i][j] || board[i][j]!=word.charAt(idx)) return false;

    visited[i][j]=true;

    boolean res=
    valid(visited,board,word,i-1,j,idx+1,n,m)||
    valid(visited,board,word,i+1,j,idx+1,n,m)||
    valid(visited,board,word,i,j-1,idx+1,n,m)||
    valid(visited,board,word,i,j+1,idx+1,n,m);

    visited[i][j]=false;

    return res;
}
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;

    boolean[][] visited=new boolean[n][m];

    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(valid(visited,board,word,i,j,0,n,m)){
                return true;
            }
        }
    }
    return false;
    }
}