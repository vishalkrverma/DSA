class Solution {
    private char[][] board;
    public void solveSudoku(char[][] board) {
        this.board=board;
        helper(0,0);
    }

    private boolean helper(int row, int col){
        if(col==9){
            row++;
            col=0;
        }

        if(row==9) return true;


        // Search the next cell...
        if(board[row][col]!='.'){
            return helper(row,col+1);
        }

        for(char i='1';i<='9';i++){
            if(!isValid(row,col,i)){
                continue;
            }
            board[row][col]=i;

            if(helper(row,col+1)==true)
                return true;
            board[row][col]='.';
        }
        return false;
    }

    private boolean isValid(int row,int col,char curr){
        for(int i=0;i<9;i++){
            if(board[row][i]==curr){
                return false;
            }
            if(board[i][col]==curr){
                return false;
            }
        }
            int[] rowBorder=findSE(row);
            int[] colBorder=findSE(col);

            for(int i=rowBorder[0];i<=rowBorder[1];i++){
                for(int j=colBorder[0];j<=colBorder[1];j++){
                    if(board[i][j]==curr)
                        return false;
                }
            }
        return true;
    }

private int[] findSE(int coor){
     int[] res=new int[2];
     if(coor<3){
        res[1]=2;
     }
     else if(coor<6){
        res[0]=3;
        res[1]=5;
     }
     else if(coor<9){
        res[0]=6;
        res[1]=8;
     }
     return res;
}
}