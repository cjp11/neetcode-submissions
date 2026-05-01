class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> arrayToSet = new HashSet<>();

        for(int i : nums) {
            arrayToSet.add(i);
        }
        if(arrayToSet.size() == nums.length) {
            return false;
        }else {
            return true;
        }
    }
}