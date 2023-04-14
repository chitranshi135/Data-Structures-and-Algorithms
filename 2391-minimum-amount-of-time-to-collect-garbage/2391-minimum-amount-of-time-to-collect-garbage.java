class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int n = garbage.length;
        int collect = 0, t = 0;
        int lastM = -1, lastP = -1, lastG = -1;
        for(int i = 0; i < n; i++)
        {
            String h = garbage[i];
            collect += h.length();
            lastM = Math.max(lastM, h.lastIndexOf('M')>=0?i:-1);
            lastP = Math.max(lastP, h.lastIndexOf('P')>=0?i:-1);
            lastG = Math.max(lastG, h.lastIndexOf('G')>=0?i:-1);
        }
        //System.out.println(collect + " "+ lastM+" "+lastP+" "+lastG);
        for(int i = 0; i < n; i++)
        {
            if(i < lastM)
                t += travel[i];
            if(i < lastP)
                t += travel[i];
            if(i < lastG)
                t += travel[i];
        }
        return t+collect;
    }
}