class Solution {
    public int averageValue(int[] nums) {
        int sum = 0 ;
        int flag = 0;
        int count = 0 ; 
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] % 2 == 0 && nums[i] % 3 == 0)
            {
                flag = 1;
                count++;
                sum += nums[i];
            }
        }
        if(flag == 1)
        {
            sum /= count;
        }
        return sum;
        
    }
}