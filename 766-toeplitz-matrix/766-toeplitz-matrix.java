class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int c=0;
        for(int i=0;i<matrix.length-1;i++)
        {
            for(int j=0;j<matrix[0].length-1;j++)
            {
                if(matrix[i][j]!=matrix[i+1][j+1])
                {
                     c++;
                     break;
                }                       
                
            }
        }
        if(c>0)
        {
            return false;
        }
        else
            return true;
    }
}