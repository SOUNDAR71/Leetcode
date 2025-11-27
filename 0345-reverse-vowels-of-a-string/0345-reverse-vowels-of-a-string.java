class Solution {
    public String reverseVowels(String s) {
        int l = s.length()-1;
        char[] arr = s.toCharArray();
        int n = 0;
        char str ;
        char str2;
        while(n < l)
        {
            if("aeiouAEIOU".contains(arr[n] + "")){
                if("aeiouAEIOU".contains(arr[l] + ""))
                {
                    str = arr[n];
                    arr[n] = arr[l];
                    arr[l] = str;
                    n++;
                    l--;
                    
                }
                else{
                    l--;
                }
            }
            else{
                n++;
            }
        }
        return new String(arr);
        
    }
}