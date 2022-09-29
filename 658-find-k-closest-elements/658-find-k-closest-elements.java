class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        int left = 0;
        int right = arr.length - 1;
        while(right - left >= k)
        {
            int d1 = Math.abs(x - arr[left]);
            int d2 = Math.abs(x - arr[right]);
            if(d1 > d2)
                left++;
            else
                right--;
        }
        for(int i = left; i <= right; i++)
            list.add(arr[i]);
        return list;
    }
}