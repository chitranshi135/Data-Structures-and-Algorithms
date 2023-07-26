class Solution {
    public double timeRequired(int[] dist, int speed){
        double time = 0.0;
        for(int i = 0; i < dist.length; i++){
            double t = (1.0 * dist[i])/speed;
            if(i == dist.length-1)
                time += t;
            else
                time += Math.ceil(t);
        }
        return time;
    }
    
    public int minSpeedOnTime(int[] dist, double hour) {
        int left = 1, right = 10000000;
        int min = -1;
        while(left <= right){
            int mid = left + (right-left)/2;
            double currTime = timeRequired(dist, mid);
            if(currTime <= hour){
                min = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return min;
    }
}