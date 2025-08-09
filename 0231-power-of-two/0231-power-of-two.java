class Solution {
    public boolean isPowerOfTwo(int n) {
      double num = n;
      while(num>0 )
      {
        if(num == 1.0)
        {
            return true;
        }
        if(num%2 != 0)
        {
            return false;
        }
        num = num/2.0;
      } 
      return false; 
    }
}