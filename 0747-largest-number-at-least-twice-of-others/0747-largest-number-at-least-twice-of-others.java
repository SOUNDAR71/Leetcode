class Solution {
    public int dominantIndex(int[] nums) {
        int max = 0 ;
        int index = 0;
        int numsSize = nums.length;
        for(int i = 0 ; i < numsSize ; i++)
        {
            if(max < nums[i])
            {
                max = nums[i];
                index = i;
            }
        }
        for(int j = 0 ; j < numsSize ; j++)
        {
            if(max < nums[j]*2 && j != index)
            {
                return -1;
            }
        }
        return index;
        
    }
}