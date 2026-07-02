// minStack: 각 스택 상태마다의 최솟값 기록을 저장하는 스택
class MinStack {

    private Deque<Integer> stack;
    private Deque<Integer> minStack;

    public MinStack() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>(); 
    }
    
    public void push(int val) {
        stack.push(val);

        if(minStack.isEmpty()) {
            minStack.push(val);
        }else {
            minStack.push(Math.min(val, minStack.peek()));
        }
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
