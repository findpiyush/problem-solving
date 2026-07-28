class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int temp;
        int count = 0;
        int j =0;
        for(int i = 0; i<n-1; i++)
        {
            if(nums[i+1]>nums[i]){
                j++;
                nums[j]= nums[i+1];
                count++;
            }
        }
        return count+1;
    }
}