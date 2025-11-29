class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer>map = new HashMap<>();
        HashMap<Character, Integer>map2 = new HashMap<>();
        for(char str : s.toCharArray())
        {
            if("aeiou".contains(Character.toString(str)))
            {
                map.put(str, map.getOrDefault(str, 0) + 1);
            }else{
                map2.put(str, map2.getOrDefault(str, 0) + 1);
            }
        }
        int max1 = map.isEmpty() ? 0 : Collections.max(map.values());
        int max2 = map2.isEmpty() ? 0 : Collections.max(map2.values());
       return max1+max2;

        
    }
}