class Solution {
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i = 0; i<numRows ; i++ )
        {
            List<Integer> temp = new ArrayList<>();
            for(int j = 0 ; j<=i ; j++)
            {
                if(j==0 || i==j)
                {
                  temp.add(1);
                }
                
                else
                {
                    int a = list.get(i-1).get(j-1) + list.get(i-1).get(j);
                    temp.add(a);
                }
            }
            list.add(temp);
        }
        return list;
    }
}