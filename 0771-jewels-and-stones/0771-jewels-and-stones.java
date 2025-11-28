class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0 ;
        for(char str : stones.toCharArray())
        {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        for(char str:jewels.toCharArray())
        {
            if(map.containsKey(str))
            {
                count += map.get(str);
            }

        }
        return count;
        
        
    }
}