package editor.cn;

import java.util.PriorityQueue;

public class KthLargestElementInAnArray215 {
    public static void main(String[] args) {
        Solution solution = new KthLargestElementInAnArray215().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            //利用容量为k的小根堆实现（申请k+1是因为先入k+1个在弹出一个最小的)
            PriorityQueue<Integer> minHeap = new PriorityQueue<>(k + 1);
            for (int num : nums) {
                if (minHeap.size() == k) {
                    if (num > minHeap.peek()) {
                        minHeap.poll();
                        minHeap.offer(num);
                    }
                }
            }
            return minHeap.peek();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}