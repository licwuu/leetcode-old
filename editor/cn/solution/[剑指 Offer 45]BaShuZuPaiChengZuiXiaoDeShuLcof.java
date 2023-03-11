package editor.cn.solution;

import java.util.Arrays;

class BaShuZuPaiChengZuiXiaoDeShuLcof{
    public static void main(String[] args) {
        Solution solution = new BaShuZuPaiChengZuiXiaoDeShuLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String minNumber(int[] nums) {
            String[] strings = new String[nums.length];
            for (int i = 0; i < nums.length; i++) {
                strings[i] = String.valueOf(nums[i]);
            }
            Arrays.sort(strings,(x,y)->(x+y).compareTo(y+x));
            StringBuffer ans = new StringBuffer();
            for (String str :
                    strings) {
                ans.append(str);
            }
            return ans.toString();
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}