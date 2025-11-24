class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        ArrayList<Boolean>list = new ArrayList<>();
        int val = 0 ; 

        for(int i = 0 ; i < nums.length ; i++)
        {
            for(int j = 0 ; j <= i ; j++)
            {
                val = val * 2 + nums[j];
                System.out.println(val);
            }
            if(val % 5 == 0)
            {
                list.add(true);
            }else{
                list.add(false);
            }
        }
        //System.out.println(val);
        return list;
    }
}