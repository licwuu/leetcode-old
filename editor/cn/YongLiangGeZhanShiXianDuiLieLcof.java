package com.licw.leetcode.editor.cn;

import java.util.Stack;

public class YongLiangGeZhanShiXianDuiLieLcof{
    public static void main(String[] args) {
        CQueue solution = new YongLiangGeZhanShiXianDuiLieLcof().new CQueue();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class CQueue {
        Stack<Integer> inStack, outStack;
        public CQueue() {
            inStack = new Stack<>();
            outStack = new Stack<>();
        }

        public void appendTail(int value) {
            inStack.push(value);
        }
        public int deleteHead() {
            if(!outStack.empty()) return outStack.pop();
            while(!inStack.empty()){
                outStack.push(inStack.pop());
            }
            return outStack.empty() ? -1 : outStack.pop();
        }
    }

    /**
     * Your CQueue object will be instantiated and called as such:
     * CQueue obj = new CQueue();
     * obj.appendTail(value);
     * int param_2 = obj.deleteHead();
     */
    //leetcode submit region end(Prohibit modification and deletion)

}