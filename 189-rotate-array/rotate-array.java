class Solution {
    public void rotate(int[] nums, int k) {
        int newAr[] = new int[nums.length];
        for(int i = 0; i<nums.length; i++)
        {
            newAr[(i+k)%nums.length] = nums[i];
        }
        for(int i = 0; i<nums.length; i++)
        {
            nums[i] = newAr[i];
        }
    }
}