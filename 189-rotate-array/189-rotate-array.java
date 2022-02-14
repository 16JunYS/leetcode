class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int i=0;
        int idx = len - k % len;
        int[] tmp = Arrays.copyOf(nums, idx);
        boolean isT = false;
        while(i < len) {
            if (idx == len) {
                idx = 0;
                isT = true;
            }
            if (isT) {
                nums[i++] = tmp[idx++];
            }
            else {
                nums[i++] = nums[idx++];
            }
        }
    }
}