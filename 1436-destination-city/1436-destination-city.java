class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<>();
        for(List<String> l : paths)
        {
            set.add(l.get(0));
        }
        for(List<String> l : paths)
        {
            String city = l.get(1);
            if(!set.contains(city))
                return city;
        }
        return "";
    }
}