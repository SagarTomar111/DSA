class Solution {
    public int maxArea(int[] height) 
    {
      int n = height.length;
      int maxWater = 0; 
      int i = 0;
      int j = n-1;
      while(i<j)
      {
        if(maxWater <  Math.min(height[i],height[j]) * (j-i))
        {
           maxWater = Math.min(height[i],height[j]) * (j-i);
        }
        if(height[i]<height[j])
        {
            i++;
        }
        else
        {
            j--;
        }
      }
      return maxWater;  
    }
}