class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashMap<Integer, Integer>map = new HashMap<>();
        for(int i : nums)
        {
            map.put(i, map.getOrDefault(i, 0) + 1 );
        }
        boolean n = true;
        int j = 0 ; 
        while(n){
           if(map.containsKey(original)){
                
                original *= 2;
            }
            else{
                n = false;
            }
        }

        return original;
    }
}