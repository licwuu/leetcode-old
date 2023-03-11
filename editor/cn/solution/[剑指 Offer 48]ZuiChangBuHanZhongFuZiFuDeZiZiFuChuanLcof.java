package editor.cn.solution;

import java.util.HashMap;
import java.util.Map;

class ZuiChangBuHanZhongFuZiFuDeZiZiFuChuanLcof{
    public static void main(String[] args) {
        Solution solution = new ZuiChangBuHanZhongFuZiFuDeZiZiFuChuanLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0,right = 0, left = 0,  len = 0;
        Map<Character, Integer> map = new HashMap<>();
        while(right < n) {
            char c = s.charAt(right);
            if(!map.containsKey(c) || map.get(c) == 0){
                map.put(c,1);
            }else {
                ans = Math.max(right - left, ans);
                while (left <= right) {
                    char leftC = s.charAt(left);
                    left++;
                    if(leftC != c){
                        map.remove(leftC);
                    } else {
                        break;
                    }

                }
            }
            right++;
        }
        return Math.max(right - left, ans);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}