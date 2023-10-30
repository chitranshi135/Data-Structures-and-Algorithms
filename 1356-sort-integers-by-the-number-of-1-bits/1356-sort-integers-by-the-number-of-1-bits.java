class Solution {
    public int[] sortByBits(int[] arr) {
        int[][] a = new int[arr.length][2];
        for(int i = 0; i < arr.length; i++){
            a[i][0] = arr[i];
            a[i][1] = Integer.bitCount(arr[i]);
        }
        Arrays.sort(a, (x, y) -> (x[1]==y[1]) ? x[0]-y[0] : x[1]-y[1]);
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = a[i][0];
        }
        return arr;
    }
}