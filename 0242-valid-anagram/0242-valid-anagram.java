class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer>map = new HashMap<>();
        
        for(int i = 0 ; i < s.length(); i++){
            char str = s.charAt(i);
            char str1 = t.charAt(i);
            map.put(str, map.getOrDefault(str, 0) + 1);
            map.put(str1, map.getOrDefault(str1, 0) - 1);

        }
        for(Integer num : map.values()){
            if(num!= 0) return false;
        }
        System.out.println(map);
        return true;
        
    }
}