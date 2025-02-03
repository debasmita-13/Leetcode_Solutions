class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        
        if(nums.length == 0)
            return 0;

        int incr=1, decr=1, res=1;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]<nums[i])
            {
                incr++;
                res = Math.max(incr,res);
            }
            else
                incr = 1;
        }

        for(int i=1; i<nums.length; i++){
            if(nums[i-1]>nums[i])
            {
                decr++;
                res = Math.max(decr,res);
            }
            else
                decr = 1;
        }

        return res;
    }
}