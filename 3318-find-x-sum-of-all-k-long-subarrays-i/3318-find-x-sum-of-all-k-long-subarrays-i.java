class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] answer = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            HashMap<Integer, Integer> freq = new HashMap<>();
            for (int j = i; j < i + k; j++) {
                freq.put(nums[j], freq.getOrDefault(nums[j], 0) + 1);
            }

            TreeSet<int[]> set = new TreeSet<>((a, b) -> {
                if (a[1] != b[1]) return b[1] - a[1];
                return b[0] - a[0]; 
            });

            for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
                set.add(new int[] {e.getKey(), e.getValue()});
            }
            int sum = 0;
            int count = 0;
            for (int[] m : set) {
                if (count == x) break;
                sum += m[0] * m[1];
                count++;
            }
            answer[i] = sum;
        }

        return answer;
    }
}
