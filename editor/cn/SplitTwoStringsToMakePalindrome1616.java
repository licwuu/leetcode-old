package editor.cn;

public class SplitTwoStringsToMakePalindrome1616 {
    public static void main(String[] args) {
        Solution solution = new SplitTwoStringsToMakePalindrome1616().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean checkPalindromeFormation(String a, String b) {
            return checkPalindrome(a, b) || checkPalindrome(b, a);
        }

        private boolean checkPalindrome(String a, String b) {
            int l = -1, r = a.length();
            while (++l < --r && a.charAt(l) == b.charAt(r)) ;

            if (l >= r) return true;
            return isPalindrome(a, l, r) || isPalindrome(b, l, r);
        }

        boolean isPalindrome(String str, int l, int r) {
            while (l < r) {
                if (str.charAt(l) != str.charAt(r)) {
                    return false;
                }
                l++;
                r--;
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}