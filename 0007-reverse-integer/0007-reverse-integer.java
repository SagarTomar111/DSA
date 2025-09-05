class Solution {
    public int reverse(int x) 
    {
     long y=0;
     int x1=x;
     while(x!=0)
     {
         y = y*10 + x%10;
         x=x/10;
     }
     if(x1 ==0)
     return 0;
     if( y> Integer.MAX_VALUE || y< Integer.MIN_VALUE)
     return 0;
     else
     return (int)y;   
    }
}