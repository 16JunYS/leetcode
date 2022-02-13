class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int ret = -1;
        
        while(left <= right) {
            int mid = (left + right) / 2;
            int number = nums[mid];
            if (number < target) {
                left = mid + 1;
            }
            else if (number > target) {
                right = mid -1;
            }
            else {
                ret = mid;
                break;
            }
        }
        
        return ret;
    }
}