class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        //결과 출력시 index+1 씩 하기

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if(sum == target) {
                //return new int[]{left+1, right+1};
                break;
            }else if(sum < target) {
                left++;
            }else {
                right--;
            }    
        }
        
        return new int[]{left+1, right+1};
    }
}
