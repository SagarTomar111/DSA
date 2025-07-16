class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid)
    {
      int n = grid.length;
      int s = n*n;
      int a[] = new int[n*n+1];
      int ans[] = new int[2];
      int sum=0,totalSum=0;
      for(int i=0 ; i<n ;i++)
      {
        for(int j=0; j<n ;j++)
        {
            if(a[grid[i][j]]>0)
            {
              ans[0] = grid[i][j];
            }
            else
            {
             sum += grid[i][j];
             a[grid[i][j]]++;   
            }
        }
      }
      totalSum = (s*(s+1))/2;
      ans[1] = totalSum-sum;
      return ans;  
    }
}