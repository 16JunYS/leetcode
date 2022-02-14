class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int i=0;
        int idx = len - k % len;
        reverse(nums, 0, idx-1);
        reverse(nums, idx, len-1);
        reverse(nums, 0, len-1);
    }
    void reverse(int[] nums, int left, int right) {
        while(left < right) {
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
            left++;
            right--;
        }
    }
}