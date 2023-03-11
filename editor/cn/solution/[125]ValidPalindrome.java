package editor.cn.solution;

class ValidPalindrome{
    public static void main(String[] args) {
        Solution solution = new ValidPalindrome().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String trans(String s){
            StringBuffer builder = new StringBuffer();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if(c >= 'a' && c <= 'z' || c >='0' && c <= '9'){
                    builder.append(c);
                }else if(c >= 'A' && c <= 'Z'){
                    builder.append((char)(c + 32));
                }
            }
            return builder.toString();
        }
        public boolean isPalindrome(String s) {
            s = trans(s);
            int len = s.length();
            for(int i = 0; i < len/2; i++){
                if(s.charAt(i) != s.charAt(len - i - 1)) return false;
            }
            return true;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}