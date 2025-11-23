class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer>map = new HashMap<>();
        ArrayList<String>list = new ArrayList<>();
        for(int i = 0 ; i < list1.length ; i++)
        {
            map.put(list1[i], i);
        }
        int min = Integer.MAX_VALUE;
        for(int j = 0 ; j < list2.length ; j++)
        {
            String str = list2[j];
            if( map.containsKey(str))
            {
                int sum = map.get(str) + j;

                if(sum < min)
                {
                    min = sum;
                    list.clear();
                    list.add(str);
                }
                else if(min == sum)
                {
                    list.add(str);
                }
            }
        }
        String[] arr = list.toArray(new String[0]);
       
        return arr;
        
    }
}