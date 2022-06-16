class Solution {
    public int diagonalSum(int[][] mat) {
        int s=mat.length;
        int sum=0;
        
             for(int i=0;i<s;i++)
             {
                 for(int j=0;j<s;j++)
                 {
                      if(i==j||(i+j)==s-1)
                      {
                         sum=sum+mat[i][j];
                      }
                    
                 }
             }
            return sum;
       
    }
}