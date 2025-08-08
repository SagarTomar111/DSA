class Solution {
    HashMap<String,Double> map ;
    public double soupServings(int n) {
        if(n>4500)
        {
            return 1.0;
        }
        n = (int) Math.ceil(n / 25.0);
        map = new HashMap<>();
        return solve(n,n);
    }
    public double solve(int a , int b)
    {
        if(a<=0 && b<=0)
            return 0.5;
        if(a<=0)
            return 1.0;
        if(b<=0)
            return 0.0;

        String key = a + "*" + b ;
        if(map.containsKey(key))
        {
            return map.get(key);
        }
        double ans = (solve(a-4,b) + solve(a-3,b-1) + solve(a-2,b-2) + solve(a-1,b-3))*0.25;
        map.put(key , ans);
        return ans;
    }
}