package editor.cn;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class LexicographicallySmallestStringAfterApplyingOperations1625 {
    public static void main(String[] args) {
        Solution solution = new LexicographicallySmallestStringAfterApplyingOperations1625().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String findLexSmallestString(String s, int a, int b) {
            String ans = s;
            HashSet<String> set = new HashSet<>();
            Queue<String> queue = new LinkedList<>();
            set.add(s);
            queue.add(s);
            while (!queue.isEmpty()) {
                String str = queue.poll();
                if (ans.compareTo(str) > 0) ans = str;

                char[] chars = str.toCharArray();

                for (int i = 1; i < chars.length; i += 2) {
                    chars[i] = (char) ((chars[i] - '0' + a) % 10 + '0');
                }
                String str1 = String.valueOf(chars);
                if (set.add(str1)) queue.add(str1);
                String str2 = str.substring(b) + str.substring(0, b);
                if (set.add(str2)) queue.add(str2);

            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}