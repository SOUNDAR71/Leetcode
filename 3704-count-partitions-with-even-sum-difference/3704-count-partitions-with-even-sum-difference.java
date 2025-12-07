class Solution {
    public int countPartitions(int[] nums) {
        int sum = 0 ;
        int sum2 = 0 ;
        int count = 0 ;
        for(int i = 0 ; i < nums.length-1 ; i++)
        {
            sum2 += nums[i];
            for(int j= i+1; j < nums.length;j++ )
            {
                sum += nums[j];
            }
            if(Math.abs(sum - sum2)%2 == 0) count++;
            sum = 0;
        }
        return count;
    }
}