class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        int n = arr.length;
        //System.out.println(arr.length);
        int k = 0;
        for(int i = 0 ; i < n; i++)
        {
            if(i < nums1.length )
            {
                arr[i] = nums1[i];
            }
            else{
                arr[i] = nums2[k++];
            }
            //System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        if(n%2 != 0)
        {
            int num = n/2;
            return arr[num];
        }
        int num = n/2;
        double num2 = arr[num] + arr[num-1] ;
        System.out.println(num2);
        return num2/2.0;
        
    
        
    }
}