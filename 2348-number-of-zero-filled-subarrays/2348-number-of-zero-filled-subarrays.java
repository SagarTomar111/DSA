class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0 ;
        int streak =0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == 0)
            {
                streak++;
                ans += 1 + (streak-1);

            }
            else
            {
                streak =0;
            }
        }
        return ans;
    }
}