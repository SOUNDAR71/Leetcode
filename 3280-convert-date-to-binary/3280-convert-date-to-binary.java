class Solution {
    public String convertDateToBinary(String date) {
        String[] p = date.split("-");
        return Integer.toBinaryString(Integer.parseInt(p[0])) + "-" +
               Integer.toBinaryString(Integer.parseInt(p[1])) + "-" +
               Integer.toBinaryString(Integer.parseInt(p[2]));
    }
}
