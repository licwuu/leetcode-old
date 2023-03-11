package editor.cn.solution;

import java.util.Comparator;
import java.util.PriorityQueue;

class ZuiXiaoDeKgeShuLcof{
    public static void main(String[] args) {
        Solution solution = new ZuiXiaoDeKgeShuLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] getLeastNumbers(int[] arr, int k) {
            if(k == 0) return new int[0];
            //大根堆
            PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
                public int compare(Integer num1, Integer num2) {
                    return num2 - num1;
                }
            });
            for (int i = 0; i < arr.length; i++) {
                if(i < k) {
                    queue.add(arr[i]);
                    continue;
                }
                if(arr[i] < queue.peek()){
                    queue.remove();
                    queue.add(arr[i]);
                }
            }
            int[] ans = new int[k];
            for (int i = 0; i < k; i++) {
                ans[i] = queue.remove();
            }
            return ans;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}