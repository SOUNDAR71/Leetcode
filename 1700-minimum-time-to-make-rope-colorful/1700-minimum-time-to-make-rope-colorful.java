class Solution {
    public int minCost(String colors, int[] neededTime) {
        int min = 0 ; 
        int count = neededTime[0]; 
        for(int i = 1 ; i < colors.length(); i++)
        {
            if(colors.charAt(i) == colors.charAt(i-1))
            {
                min += Math.min(count, neededTime[i]);

                count = Math.max(count, neededTime[i]);
            }
            else{
                count = neededTime[i];
            }
        }
        System.out.println(min);
        return min ;
    }
}