class Solution {
    public double myPow(double x, int n)
    {
       double ans = 1;
       long p = n;
       if(p < 0)
       {
          x = 1/x;
          p = -p;
       }
       while(p>0)
       {
        if(p%2 == 1)
        {
            ans = ans*x ;
            p = p-1;
        }
        else
        {
            p = p/2;
            x = x*x;
        }
       }
       return ans;
    }
}