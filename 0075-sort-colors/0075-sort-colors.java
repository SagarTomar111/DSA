class Solution {
    public void sortColors(int[] nums) 
    {
        int zeros=0,ones=0,twos=0;
        for(int i = 0 ; i<nums.length ; i++)
        {
            if(nums[i] == 0 )
            {
                zeros++;
            }
            if(nums[i] == 1 )
            {
                ones++;
            }
            if(nums[i] == 2 )
            {
                twos++;
            }
        }
        int i;
        for( i = 0 ; i<zeros ; i++)
        {
            nums[i] = 0;
        }
        for(  ; i<zeros+ones ; i++)
        {
            nums[i] = 1;
        }
        for(  ; i<zeros+ones+twos ; i++)
        {
            nums[i] = 2;
        }
    }
}