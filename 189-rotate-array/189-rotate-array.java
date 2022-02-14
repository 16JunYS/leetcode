class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] tmp = Arrays.copyOf(nums, len);
        int i=0;
        int idx = len - k%len;
        while(i < len) {
            if (idx == len)
                idx = 0;
            nums[i++] = tmp[idx++];
        }
    }
}