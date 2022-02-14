class Solution {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int idx = -1;
        int[] squares = new int[len];
        for (int i=0; i < len; i++) {
            if (nums[i] < 0) idx++;
            nums[i] = nums[i] * nums[i];
            squares[i] = nums[i];
        }
        if (idx >= 0) {
            int i = 0;
            int left = idx;
            int right = idx + 1;
            while( i < len) {
                if (left < 0) {
                    squares[i++] = nums[right++];
                    continue;
                }
                if (right >= len) {
                    squares[i++] = nums[left--];
                    continue;
                }
                if (nums[left] < nums[right]) {
                    squares[i++] = nums[left--];
                }
                else {
                    squares[i++] = nums[right++];
                }
            }
        }
        return squares;
    }
}