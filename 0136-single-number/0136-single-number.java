class Solution 
{
    public int singleNumber(int[] nums) 
    {
      int x = 0;
      int n = nums.length;
      for(int i=0 ;i<n ; i++)
      {
         x = x^nums[i]; //XOR = XOR^nums[i];
      }  
      return x;
    }
}