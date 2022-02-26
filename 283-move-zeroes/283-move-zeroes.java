class Solution {
    public void moveZeroes(int[] nums) {
        int zeroIdx = nums.length-1;
        for (int i=0; i < zeroIdx; i++) {
            if (nums[i] == 0) {
                int tmp = nums[zeroIdx];
                for (int t = i; t < zeroIdx-1; t++) {
                    nums[t] = nums[t+1];
                }
                nums[zeroIdx-1] = tmp;
                nums[zeroIdx--] = 0;
                i--;
            }
        }
    }
}