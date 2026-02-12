class Solution {
    public int diagonalSum(int[][] mat) {
        if(mat.length == 1) return mat[0][0];
        int r = mat[0].length -1 ;
        int m = mat.length / 2;
       // System.out.println(m);
        int sum = 0 ; 
        for(int i = 0 ; i < mat[0].length ; i++)
        {
            for(int j = 0 ; j < mat.length ; j++)
            {
                if(i == j || r == j ) {
                    //System.out.println("sum: "+sum + "r: "+ r);
                    sum += mat[i][j];
                    //System.out.println(r);

                }
                
                
                    
            }
            r--;
        } 
        //System.out.println(sum);
        //if( mat.length % 2 != 0)  sum = sum - mat[m][m]; 
       // System.out.println("Sum" + sum + " Number" + mat[m][m]);

       
        return sum;
        
    }
}