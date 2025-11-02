class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] arr = new int[m][n];   
        for(int i = 0 ; i < guards.length ; i++)     
        {
            int num1 = guards[i][0];
            int num2 = guards[i][1];
            arr[num1][num2] = -1;
        }
        for(int i = 0 ; i < walls.length; i++)
        {
            int num1 = walls[i][0];
            int num2 = walls[i][1];
            arr[num1][num2] = 1;
        }
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        for(int i = 0 ; i < arr.length; i++)
        {
            for(int j = 0 ; j < arr[0].length ; j++)
            {
                if(arr[i][j] == -1)
                {
                    for(int k = 0 ; k < 4 ; k++)
                    {
                        int x = i+dx[k];
                        int y = j + dy[k];
                        while(x >= 0 && y >= 0 && x < m && y < n && arr[x][y] != 1 && arr[x][y] != -1)
                        {
                            if(arr[x][y] == 0) arr[x][y] = 3;
                            x += dx[k];
                            y += dy[k];
                        }
                    }
                }
            }
        }
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr[0].length ; j++)
            {
                if(arr[i][j] == 0) count++;
            }
        }
        return count ;
    }
}