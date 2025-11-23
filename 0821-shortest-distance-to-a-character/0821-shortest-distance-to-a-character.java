class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] answer = new int[s.length()];
        int sum ;
        ArrayList<Integer>list = new ArrayList<>();
        for(int i = 0 ; i < s.length() ; i++)
        {
            if(s.charAt(i) == c)
            {
                list.add(i);
            }
        }
        for(int j = 0 ; j < s.length(); j++)
        {
            int min = Integer.MAX_VALUE;
            for(int k = 0 ; k < list.size(); k++)
            {
                sum = Math.abs(j - list.get(k));
                min = Math.min(min, sum);
                //System.out.println(sum + " "+min + "");
            }
            answer[j] = min;
            System.out.println(answer[j]);
           
        }
        return answer;

        
    }
}