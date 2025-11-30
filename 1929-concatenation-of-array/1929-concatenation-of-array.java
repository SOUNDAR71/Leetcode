class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        // int k = 0 ;
        // int i = 0;
        // while(i < nums.length*2)
        // {
        //     ans[i] = nums[k++];
        //     if(k == nums.length)
        //     {
        //         k = 0 ;
        //     }
        //     i++;

        // }
        System.arraycopy(nums, 0, ans, 0, nums.length);
        System.arraycopy(nums, 0, ans, nums.length, nums.length);
        return ans;

        
    }
}