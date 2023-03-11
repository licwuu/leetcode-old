package editor.cn.solution;

import java.util.HashSet;
import java.util.Set;

class LongestSubstringWithoutRepeatingCharacters{
    public static void main(String[] args) {
        Solution solution = new LongestSubstringWithoutRepeatingCharacters().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int len = s.length(),ans = 0, l = 0, r = 0;
            Set<Character> set = new HashSet<>();
            if(len < 2) return len;
            while (r < len){
                char c = s.charAt(r);
                if(!set.contains(c)){
                    set.add(c);
                }else {
                    char front;
                    while ((front = s.charAt(l)) != c){
                        set.remove(front);
                        l++;
                    }
                    l++;
                }
                r++;
                ans = Math.max(ans, r - l);
            }
            return ans;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}