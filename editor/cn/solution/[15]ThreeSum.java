package editor.cn.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum{
    public static void main(String[] args) {
        Solution solution = new ThreeSum().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> ans = new ArrayList();
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                if( i > 0 && nums[i] == nums[i - 1])
                    continue;;
                int j = i + 1, k = nums.length - 1;
                while (j < k){
                    int target = nums[i] + nums[j] + nums[k];
                    if(target == 0){
                        ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        while(j < k && nums[j] == nums[++j]);
                        while(j < k && nums[k] == nums[--k]);
                    }else if(target < 0){
                        j ++;
                    }else {
                        k --;
                    }
                }
            }
            return ans;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}