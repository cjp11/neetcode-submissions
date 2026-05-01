class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>(); //중복 제거

        for(int num : nums) {
            set.add(num);
        }

        int answer = 0;
        for(int num : set) {
            if(!set.contains(num-1)) { //이전 값이 없으면 시작점
                int currentNum = num;
                int length = 1;

                while (set.contains(currentNum+1)) {
                    currentNum++;
                    length++;
                }

                answer = Math.max(length, answer);
            }
        }
        return answer;
    }
}
//for문 내부에 while문이 있지만 시작점에서만 돌며 딱 1번만 수행하므로 O(n)임