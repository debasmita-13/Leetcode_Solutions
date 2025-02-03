class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        
        if(nums.length == 0)
            return 0;

        int asc=1, desc=1, longest=1;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i+1]>nums[i])
            {
                asc++;   desc = 1;
            }
            else if(nums[i+1]<nums[i])
            {
                asc = 1;   desc++;
            }
            else
            {
                asc = 1;   desc = 1;
            }
            longest = Math.max(longest, Math.max(asc,desc));
        }

        return longest;
    }
}