class Solution {
    void booleanMatrix(int mat[][]) {
        // code here
        int r=mat.length;
        int c=mat[0].length;
        int row[]=new int[r];
        int col[]=new int[c];
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j]==1){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(row[i]==1 || col[j]==1){
                    mat[i][j]=1;
                }
            }
        }
        return;
    }
}