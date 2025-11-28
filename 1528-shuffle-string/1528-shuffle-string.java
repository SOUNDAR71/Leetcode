class Solution {
    public String restoreString(String s, int[] indices) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char str = s.charAt(i);
            arr[indices[i]] = str;
        }
        String st = new String(arr);
        return st;

    }
}