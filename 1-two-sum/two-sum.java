class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int sum = 0;
        int index[] = new int[2];
        for(int i = 0; i<n-1; i++)
        {
            sum = nums[i];
            for(int j = i+1; j<n; j++)
            {
                if(sum+nums[j]==target)
                {
                    index[0] = i;
                    index[1] = j;
                    return index;
                }
            }
        }
        return index;
    }
}