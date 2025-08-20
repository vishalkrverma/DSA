class GfG {
    /*you are required to complete this method*/
    int countZeros(int A[][], int N) {
        int n=A.length;
        int col=A[0].length-1;
        int row=0;
        int cnt=0;
        
        while(row<n && col>=0){
            if(A[row][col]==0){
                cnt+=(col+1);
                row++;
            }
            else
                col--;
        }
        return cnt;
    }
}