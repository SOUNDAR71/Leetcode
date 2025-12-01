class Solution {
    public int numberOfMatches(int n) {
        int ans = 0;
        while(n > 0)
        {
            int num = n/2;
            ans += n - num;
            n /= 2;
        }
        return ans-1;
        
    }
}