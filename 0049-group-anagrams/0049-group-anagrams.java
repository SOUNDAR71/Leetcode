class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List<String>>map = new HashMap<>();

       for(String words:strs){
        char[] chars = words.toCharArray();
        Arrays.sort(chars);
        String str = new String(chars);

        if(!map.containsKey(str)){
            map.put(str, new ArrayList<>());
        }
            map.get(str).add(words);
       }
       return new ArrayList<>(map.values());
        
    }
}