class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] tmp = new int[len];
        for (int i=0; i < len; i++) {
            tmp[i] = nums[i];
        }
        int i=0;
        int idx = len - k%len;
        while(i < len) {
            if (idx == len)
                idx = 0;
            nums[i++] = tmp[idx++];
        }
    }
}