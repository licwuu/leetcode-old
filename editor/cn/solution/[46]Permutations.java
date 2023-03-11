package editor.cn.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Permutations{
    public static void main(String[] args) {
        Solution solution = new Permutations().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<List<Integer>> ans = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        public List<List<Integer>> permute(int[] nums) {
            helper(nums, 0);
            return ans;
        }
        private void helper(int[] nums, int index){
            if(index == nums.length){
                ans.add(new ArrayList<>(stack));
                return;
            }
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] != -100){
                    stack.push(nums[i]);
                    nums[i] = -100;
                    helper(nums, index + 1);
                    nums[i] = stack.pop();
                }
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}