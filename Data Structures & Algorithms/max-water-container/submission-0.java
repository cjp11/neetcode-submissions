//모든 두 인덱스의 거리와 그 두 인덱스의 최소값의 곱이 최대인 값 출력
class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int maxVal = 0;

        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(heights[left], heights[right]);
            int area = width * minHeight;

            maxVal = Math.max(maxVal, area);
            
            //height가 더 작은 index가 움직임
            if(heights[left] < heights[right]) {
                left++;
            }else {
                right--;
            }
        }

        return maxVal;
    }
}
