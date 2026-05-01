class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> arrayToSet = new HashSet<>();

        for(int i : nums) {
            if(arrayToSet.contains(i)) {
                return true;
            }
            arrayToSet.add(i);
        }
        return false;
        /* 전체 add해서 길이 비교
        // 모든 원소를 다 알 필요없음!
        if(arrayToSet.size() == nums.length) {
            return false;
        }else {
            return true;
        }
        */
    }
}