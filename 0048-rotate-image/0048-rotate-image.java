class Solution {
 
  public void swap(int[] nums){
    int i=0;
    int j=nums.length-1;
    while(i<j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        i++;
        j--;
    }
  }

    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int [] num:matrix){
               swap(num);
        }
    }
}