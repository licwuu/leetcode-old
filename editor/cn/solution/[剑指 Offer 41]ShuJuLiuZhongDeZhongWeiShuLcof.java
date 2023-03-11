package editor.cn.solution;

import java.util.PriorityQueue;
import java.util.Queue;

class ShuJuLiuZhongDeZhongWeiShuLcof{
    public static void main(String[] args) {
        MedianFinder solution = new ShuJuLiuZhongDeZhongWeiShuLcof().new MedianFinder();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class MedianFinder {
        private Queue<Integer> left, right;
        private int i;
        /** initialize your data structure here. */
        public MedianFinder() {
            left = new PriorityQueue<>((x, y) -> (y - x));//大根堆
            right = new PriorityQueue<>();//小根堆
        }

        public void addNum(int num) {
            if(left.size() == right.size()){
                right.add(num);
                left.add(right.remove());
            }else {
                left.add(num);
                right.add(left.remove());
            }
        }

        public double findMedian() {
            return left.size() == right.size() ? (left.peek() + right.peek()) / 2.0 : left.peek();
        }
    }

    /**
     * Your MedianFinder object will be instantiated and called as such:
     * MedianFinder obj = new MedianFinder();
     * obj.addNum(num);
     * double param_2 = obj.findMedian();
     */
    //leetcode submit region end(Prohibit modification and deletion)

}