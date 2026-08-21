class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ctr=0;
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
            ctr++;
            }
            else
            ctr=0;
            max=Math.max(max,ctr);
        }
        return max;
    }
}