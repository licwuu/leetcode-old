package editor.cn.solution;

import java.util.Stack;

class MinStackSolution{
    public static void main(String[] args) {
        MinStack solution = new MinStackSolution().new MinStack();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class MinStack {
        Stack<Integer> stack, minVal;
        public MinStack() {
            stack = new Stack<>();
            minVal = new Stack<>();
        }

        public void push(int val) {
            stack.push(val);
            if(minVal.isEmpty() || val <= minVal.peek()){
                minVal.push(val);
            }
        }

        public void pop() {
            if(minVal.peek().equals(stack.peek())){
                minVal.pop();
            }
            stack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minVal.peek();
        }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
//leetcode submit region end(Prohibit modification and deletion)

}