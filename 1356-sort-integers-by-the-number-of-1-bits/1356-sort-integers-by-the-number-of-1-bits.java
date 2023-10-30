class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] a = new Integer[arr.length];
        for(int i = 0; i < arr.length; i++)
            a[i] = arr[i];
        
        Arrays.sort(a, new CustomCompare());
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = a[i];
        }
        return arr;
    }
}

class CustomCompare implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        int c1 = Integer.bitCount(a);
        int c2 = Integer.bitCount(b);
        
        if(c1 == c2)
            return a-b;
        
        return c1-c2;
    }
}