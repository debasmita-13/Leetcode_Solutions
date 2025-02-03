class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        
        if(nums.length == 0)
            return 0;

        int incr=1, decr=1, res=1;
        for(int i=1; i< nums.length; i++){
            if(nums[i-1]==nums[i]){
                incr=1;
                decr=1;
            }else 
            if(nums[i-1]>nums[i]){
                incr=1;
                decr++;
            } else{
                incr++;
                decr=1;
            }
            res = Math.max(res, Math.max(incr,decr));
        }
        return res;
    }
}