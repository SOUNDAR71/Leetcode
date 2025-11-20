class Solution {
    public int maxPower(String s) {
        int i = 0 ;
        int count = 1 ;
        //System.out.println(count);
        int max = 2 ;
        int flag = 0 ; 
        while(i< s.length()-1)
        {
           if(s.charAt(i) == s.charAt(i+1))
           {
                flag = 1;
                count = count + 1;
           }
           else{
            if(max<count)
            {
                max = count;
                System.out.println(max+"max"+" "+count+"Count");
            }
            count = 1 ;
           }
            i++;
        }
        if(flag == 0)
        {
            return count;
        }
        return Math.max(max, count);
        
    }
}