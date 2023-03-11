package editor.cn.solution;

import java.util.Stack;

class BaoHanMinhanShuDeZhanLcof{
    public static void main(String[] args) {
        MinStack solution = new BaoHanMinhanShuDeZhanLcof().new MinStack();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class MinStack {

    Stack<Integer> list;
    Stack<Integer> min_num;
    /** initialize your data structure here. */
    public MinStack() {
        list = new Stack<>();
        min_num = new Stack<>();
    }
    
    public void push(int x) {
        list.add(x);
        if(min_num.isEmpty()){
            min_num.add(x);
        }else{
            min_num.add(Math.min(x, min_num.peek()));
        }
    }
    
    public void pop() {
        list.pop();
        min_num.pop();
    }
    
    public int top() {
        return list.peek();
    }
    
    public int min() {
        return min_num.isEmpty()? Integer.MIN_VALUE : min_num.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */
//leetcode submit region end(Prohibit modification and deletion)

}