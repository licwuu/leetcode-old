package editor.cn.solution;

import java.util.LinkedList;
import java.util.Queue;

class NumberOfRecentCalls{
    public static void main(String[] args) {
        RecentCounter solution = new NumberOfRecentCalls().new RecentCounter();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class RecentCounter {
        Queue<Integer> q;
        public RecentCounter() {
            q = new LinkedList<>();
        }

        public int ping(int t) {
            q.offer(t);
            while(q.peek() < t - 3000) q.poll();
            return q.size();
        }
    }

    /**
     * Your RecentCounter object will be instantiated and called as such:
     * RecentCounter obj = new RecentCounter();
     * int param_1 = obj.ping(t);
     */
    //leetcode submit region end(Prohibit modification and deletion)

}