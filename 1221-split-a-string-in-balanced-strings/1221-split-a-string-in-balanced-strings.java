class Solution {
    public int balancedStringSplit(String s) {
        int count = 0 ;
        int bal = 0 ;
        for(char str:s.toCharArray())
        {
            if(str == 'L')
            {
                bal++;
            }else{
                bal--;
            }
            if(bal == 0) count++;
        }
        return count;
    }
}