package editor.cn.solution;

import java.util.ArrayList;
import java.util.List;

class RangeSumQueryImmutable{
    public static void main(String[] args) {
        NumArray solution = new RangeSumQueryImmutable().new NumArray(new int[0]);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class NumArray {
        List<Integer> list = new ArrayList<>();
        public NumArray(int[] nums) {
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                list.add(sum);
            }
        }

        public int sumRange(int left, int right) {
            if(left == 0) return list.get(right);
            else return list.get(right) - list.get(left - 1);
        }
    }

    /**
     * Your NumArray object will be instantiated and called as such:
     * NumArray obj = new NumArray(nums);
     * int param_1 = obj.sumRange(left,right);
     */
    //leetcode submit region end(Prohibit modification and deletion)

    }