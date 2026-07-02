//true인 케이스 먼저 떠올리기
//false인 케이스 처리하기(동시에 구상하지 말자)
class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            
            //여는 괄호면 닫는 괄호를 push
            if(map.containsKey(c)) {
                stack.push(map.get(c));
            }
            else {
                //첫 요소 혹은 ())처럼 여는게 먼저 오는 경우
                if(stack.isEmpty()) return false;
                //true 케이스
                char expected = stack.pop();
                if(c != expected) {
                    return false;
                }
            }
        }

        //비어야 정상
        return stack.isEmpty();


    }
}
