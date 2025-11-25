class Solution {
    public int smallestRepunitDivByK(int k) {
        int number = 0;
        if(k%2 == 0|| k%5 == 0)
        {
            return -1;
        }
        for(int i = 1 ; i <=k ; i++)
        {
            number = (number *10+1) % k;
            if(number == 0) return i;
        }
        
        return -1;
        
    }
}