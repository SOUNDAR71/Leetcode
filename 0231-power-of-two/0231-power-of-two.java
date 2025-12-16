class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 1)
            return true;
        int count = 0;
        int num;
        while (n > 0) {
            num = n % 2;
            if (num == 1)
                count++;
            n /= 2;

        }
        if (count == 1)
            return true;

        return false;

    }
}