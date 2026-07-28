class Solution {
    public int searchInsert(int[] nums, int target) {
        int high = nums.length;
        int low = 0;
        while(high>low)
        {
            int mid = low + (high-low)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            if(nums[mid]>target)
            {
                high = mid;
            }
            if(nums[mid]<target)
            {
                low = mid+1;
            }
            if(low==high)
            {
                return low;
            }
            
        }
        return -1;
    }
}