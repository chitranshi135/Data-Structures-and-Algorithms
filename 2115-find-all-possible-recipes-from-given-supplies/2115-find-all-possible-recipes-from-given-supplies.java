class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        List<String> res = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        //0 for not checked
        //1 for checking
        //2 for checked and found
        HashMap<String, Integer> checked = new HashMap<>();
        
        for(int i = 0; i < recipes.length; i++){
            map.put(recipes[i], ingredients.get(i));
            checked.put(recipes[i], 0);
        }

        for(int i = 0; i < supplies.length; i++)
            checked.put(supplies[i], 2);
        
        
        for(int i = 0; i < recipes.length; i++){
            if(checked.get(recipes[i]) == 0)
                dfs(recipes[i], checked, map, res);
        }
        
        return res;
    }
    
    public boolean dfs(String s, HashMap<String, Integer> checked, HashMap<String, List<String>> map, List<String> res){
        if(!checked.containsKey(s))
            return false;
        
        if(checked.get(s) == 1)
            return false;
        
        if(checked.get(s) == 2)
            return true;
        
        checked.put(s, 1);
        for(String x : map.get(s)){
            if(!dfs(x, checked, map, res)){
                return false;
            }
        }
        
        checked.put(s, 2);
        res.add(s);
        return true;
    }
}