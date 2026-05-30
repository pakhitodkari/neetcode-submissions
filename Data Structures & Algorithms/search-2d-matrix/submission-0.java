class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int col = matrix[0].length;
        int row = matrix.length;
        int n=-1;
        for(int i=0;i<row;i++){
            if(matrix[i][0]<=target && matrix[i][col-1]>=target){
                n = i;
                break;
            }
        }
        if(n != -1){
            for(int j=0;j<col;j++){
                if(matrix[n][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
