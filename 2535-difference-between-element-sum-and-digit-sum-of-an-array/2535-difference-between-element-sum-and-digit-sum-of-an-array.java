class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int sum2 = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            sum += nums[i];
            int n = nums[i];
            while(n > 0)
            {
                int rem = n %10;
                sum2 += rem;
                n /= 10;
            }
        }
        return (sum - sum2);
    }
}