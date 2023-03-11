package editor.cn;

public class CountAndSay38 {
    public static void main(String[] args) {
        Solution solution = new CountAndSay38().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String countAndSay(int n) {
            String ans = "1";
            for (int i = 1; i < n; i++) {
                ans = SayString(ans);
            }
            return ans;
        }


        private String SayString(String s){
            StringBuilder builder = new StringBuilder();
            int k = 1;
            for (int i = 1; i < s.length(); i++) {
                if(s.charAt(i) == s.charAt(i - 1)){
                    k++;
                }else {
                    builder.append(k).append(s.charAt(i - 1));
                    k = 1;
                }
            }
            builder.append(k).append(s.charAt(s.length() - 1));
            return builder.toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}