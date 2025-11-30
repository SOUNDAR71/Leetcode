class Solution {
    public String truncateSentence(String s, int k) {
        String[] Str = s.split(" ");
        String Str2 = "";
        for (int i = 0; i < k; i++) {
            Str2 += Str[i];
            if (i != k - 1) {
                Str2 += " ";
            }
        }
        return Str2;

    }
}