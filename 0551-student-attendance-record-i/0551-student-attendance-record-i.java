class Solution {
    public boolean checkRecord(String s) {
        int count = 0;
        int count2 = 0;
        for (char str : s.toCharArray()) {
            if (str == 'A') {
                count++;
                count2 = 0;
            } else if (str == 'L') {
                count2++;
            } else if (str == 'P') {
                count2 = 0;
            }
            if (count >= 2 || count2 >= 3) {
                return false;
            }
        }
        return true;

    }
}