class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;

        for (int n : nums) {
            int count = 0;
            int tempSum = 0;

            for (int i = 1; i * i <= n; i++) {
                if (n % i == 0) {
                    int j = n / i;

                    if (i == j) {
                        count += 1;
                        tempSum += i;
                    } else {
                        count += 2;
                        tempSum += i + j;
                    }

                    if (count > 4) break;
                }
            }

            if (count == 4) {
                sum += tempSum;
            }
        }

        return sum;
    }
}
