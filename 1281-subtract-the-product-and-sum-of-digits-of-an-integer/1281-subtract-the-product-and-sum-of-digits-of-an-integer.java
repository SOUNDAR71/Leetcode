class Solution {
    public int subtractProductAndSum(int n) {
        if(n <10) return n;
        int sum = 0 ;
        int sub = 1;
        while(n > 0)
        {
            int rem = n%10;
            sum += rem;
            sub *= rem;
            n /= 10;
        }
        return sub - sum;
        
    }
}