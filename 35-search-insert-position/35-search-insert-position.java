class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int ret = 0;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            int midN = nums[mid];
            if (midN < target) {
                left = mid + 1;
                ret = left;
            }
            else if (midN > target) {
                right = mid - 1;
                ret = mid;
            }
            else {
                ret = mid;
                break;
            }
        }
        
        return ret;
    }
}