class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indices = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            int diff = target - nums[i];
            
            if(indices.containsKey(diff)) { 
                //key를 찾았다 = i보다 이전 index에서 찾았다 => {i, indices.get(diff)} 가 아님!
                return new int[] {indices.get(diff), i};
            }
            indices.put(nums[i], i);
        }

        return new int[0];
    }
}