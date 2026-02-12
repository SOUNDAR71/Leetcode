class Solution {
    public int diagonalSum(int[][] mat) {
        if (mat.length == 1)
            return mat[0][0];
        int sum = 0;
        for (int i = 0; i < mat[0].length; i++) {
            sum += mat[i][i];
            int j = mat.length - 1 - i;
            if (i != j)
                sum += mat[i][j];
        }

        return sum;

    }
}