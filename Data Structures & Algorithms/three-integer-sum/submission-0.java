class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        //i: 고정, 나머지 뒷 요소 투포인터
        for(int i=0; i<nums.length-2; i++) {

            //중복 제거(nums[left]와 nums[right] 중복 제거와 같은 맥락)
            if(i>0 && nums[i] == nums[i-1]) {
                continue;
            }    
            int left = i+1;
            int right = nums.length-1;


            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];


                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    left++;
                    right--;

                    //중복 제거
                    while (left < right && nums[left] == nums[left-1]) {
                        left++;
                    }
                    //중복 제거
                    while (left < right && nums[right] == nums[right+1]) {
                        right--;
                    }

                }else if(sum < 0) {
                    left++;
                }else {
                    right--;
                }
            }
        }
        
        return result;
    }
}
