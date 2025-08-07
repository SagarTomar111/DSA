class Solution {
    public int maxCollectedFruits(int[][] fruits) 
    {
        int ans = 0 ;
        int n = fruits.length;
        for(int i=0 ; i<n ; i++)
        {
            ans += fruits[i][i];
        }
        ans += fruits[0][n-1];
        int j = n-1;
        for( int i = 1; i<n ; i++)
        {
           if(i==j)
           {

           }
           else if(i == j-1)
           {
            ans += fruits[i][j];
           }
           else
           {
            ans += Math.max(fruits[i][j],fruits[i][j-1]);
           }
        }
        int i = n-1;
        j = 0;
        ans += fruits[i][j];
        for(j=1 ; j<n ; j++)
        {
            if(i == j)
            {
               
            }
            else if(j == i-1)
            {
                ans += fruits[i][j];
            }
            else 
            {
              ans += Math.max(fruits[i][j],fruits[i-1][j]);  
            }
        }
        return ans;
    }
}