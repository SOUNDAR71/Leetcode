class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] arr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashMap<String,Integer>map = new HashMap<>();
        String str4 = "";
        for(String str:words)
        {
            char[] st = str.toCharArray();
            for(int i = 0 ; i<st.length; i++)
            {
                int num = st[i] - 'a' + 1;
                str4 += arr[num-1]+"";
            }
            System.out.println(str4);
            map.put(str4, map.getOrDefault(str, 0) + 1);
            str4 = "";
        }
        return map.size();

        
        
    }
}