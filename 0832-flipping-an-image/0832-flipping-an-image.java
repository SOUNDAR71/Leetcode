class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int right = image.length;
        int left = image[0].length;
        int k = 0;
        int[][] arr = new int[right][left];
        for(int i = 0  ; i<image.length ; i++)
        {
            for(int j = image[0].length - 1 ; j >= 0; j--)
            {
                if(image[i][j] == 0)
                {
                    arr[i][k++] = 1;
                }else{
                    arr[i][k++] = 0;
                }
            }
            k = 0;
        }
        return arr;
    }
}