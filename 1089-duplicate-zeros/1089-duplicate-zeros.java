class Solution {
    public void duplicateZeros(int[] arr) {
        int zero = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0)
                zero++;
        }
        for(int i = arr.length-1; i >= 0; i--){
            
            if(arr[i] == 0)
            {
                if(i+zero-1 < arr.length)
                    arr[i+zero-1] = 0;
                if(i+zero < arr.length)
                    arr[i+zero] = 0;
                zero--;
            } 
            else
            {
                if(i+zero < arr.length)
                    arr[i+zero] = arr[i];
            }
        }
    }
}