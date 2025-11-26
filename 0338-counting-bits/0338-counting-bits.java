class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n + 1];
        int num;
        arr[0] = 0;
        for (int i = 1; i <= n; i++) {
            num = Integer.bitCount(i);
            arr[i] = num;
        }
        return arr;

    }
}