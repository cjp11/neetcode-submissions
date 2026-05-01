class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];

        //left output[i]
        //i를 제외한 왼쪽 nums 요소들의 곱. num[0] ~ num[i-1]
        //정의상 output[0] = 1;
        output[0] = 1;
        for(int i=1; i<n; i++) {
            output[i] = output[i-1] * nums[i-1];
        }

        //i를 제외한 모든 nums 요소들의 곱(완전체)
        int right = 1;
        for(int i=n-1; i>=0; i--) {
            output[i] = output[i] * right;
            right = right * nums[i];
        }

        return output;
    }
}  
