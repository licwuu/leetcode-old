package editor.cn.solution;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

class DuiLieDeZuiDaZhiLcof{
    public static void main(String[] args) {
        MaxQueue solution = new DuiLieDeZuiDaZhiLcof().new MaxQueue();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class MaxQueue {
        Queue<Integer> queue;
        Deque<Integer> maxValueQ;
        public MaxQueue() {
            queue = new LinkedList<>();
            maxValueQ = new LinkedList<>();
        }

        public int max_value() {
            if(maxValueQ.isEmpty())
                return -1;
            return maxValueQ.peekFirst();
        }

        public void push_back(int value) {
            queue.add(value);
            while (!maxValueQ.isEmpty() && maxValueQ.peekLast() < value)
                maxValueQ.pollLast();
            maxValueQ.offerLast(value);
        }

        public int pop_front() {
            if(queue.isEmpty())
                return -1;
            int res = queue.poll();
            if(res == maxValueQ.peekFirst())
                maxValueQ.pollFirst();
            return res;
        }
    }

    /**
     * Your MaxQueue object will be instantiated and called as such:
     * MaxQueue obj = new MaxQueue();
     * int param_1 = obj.max_value();
     * obj.push_back(value);
     * int param_3 = obj.pop_front();
     */
    //leetcode submit region end(Prohibit modification and deletion)

}