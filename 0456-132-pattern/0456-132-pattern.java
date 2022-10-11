class Solution {
    public boolean find132pattern(int[] arr) {
        int n = arr.length;
        int[] a = Arrays.copyOf(arr, arr.length);
        int[] smallest = new int[n];
        int min = arr[0];
        smallest[0] = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] > min)
            {
                smallest[i] = min;
            }
            else
            {
                smallest[i] = Integer.MIN_VALUE;
                min = Math.min(min, arr[i]);
            }
        }
        for (int j = n - 1, k = n; j >= 0; j--) {
            while(k < n && k > j && a[k] <= smallest[j])
            {
                k++;
            }
            if(k < n && smallest[j] != Integer.MIN_VALUE && a[k] < arr[j])
                return true;
            k = j;
        }
        return false;
    }
}