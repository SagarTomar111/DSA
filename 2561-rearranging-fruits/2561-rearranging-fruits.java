class Solution {
    public long minCost(int[] basket1, int[] basket2) {
      HashMap<Integer,Integer> map = new HashMap<>();
      int n = basket1.length;
      int min = Integer.MAX_VALUE;
      for(int i=0 ; i<n ; i++)
      {
        map.put(basket1[i],map.getOrDefault(basket1[i], 0)+1);
        map.put(basket2[i],map.getOrDefault(basket2[i], 0)-1);
        min = Math.min(min,Math.min(basket1[i],basket2[i]));
      } 
      List<Integer> list = new ArrayList<>();
      for(Integer key : map.keySet()) 
      {
         int count = map.get(key);
         if(count % 2 != 0)
         {
            return -1;
         }
         for(int i = 0 ; i<Math.abs(count/2); i++)
         {
            list.add(key);
         }
      }
      Collections.sort(list);
      long ans = 0;
      for(int i =0; i<list.size()/2; i++)
      {
         ans += Math.min(min*2, list.get(i));
      }
      return ans;
    }
}