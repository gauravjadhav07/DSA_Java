class Solution {
    public int diagonalSum(int[][] mat) {
        int row=mat.length;
        int col=mat[0].length;
        int sum=0;
        for(int i=0;i<Math.min(row,col);i++)
        {
        
            sum += mat[i][i];
            sum+= mat[i][col-1-i];
            
        }

        if((col-1)%2==0){
            sum-= mat[(col-1)/2][(col-1)/2];
        }
        return sum;
        }
        

    }
