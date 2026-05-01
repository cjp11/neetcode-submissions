class Solution { //가장 직관적인 방식. O(n2)
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];

        for(int i=0; i<n; i++) {
            int prod = 1;
            for(int j=0; j<n; j++) {
                if(i!=j) {
                    prod = prod * nums[j];
                }
            }
            output[i] = prod;
        }

        return output;
    }
}  
