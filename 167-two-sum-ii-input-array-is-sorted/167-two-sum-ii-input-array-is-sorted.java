class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ret = new int[2];
        int numLen = numbers.length;
        
        for (int i=0; i < numLen; i++) {
            boolean isFound = false;
            int left = i+1;
            int right = numLen;
            int num1 = numbers[i];
            while(left < right) {
                int mid = (left + right) / 2;
                int num2 = numbers[mid];
                if (num1 + num2 < target) {
                    left = mid + 1;
                }
                else if (num1 + num2 > target) {
                    right = mid;
                }
                else {
                    isFound = true;
                    ret[0] = i+1;
                    ret[1] = mid+1;
                    break;
                }
            }
            if (isFound) {
                break;
            }
        }
        return ret;
    }
}