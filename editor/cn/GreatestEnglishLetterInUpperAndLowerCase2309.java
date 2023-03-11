package editor.cn;

public class GreatestEnglishLetterInUpperAndLowerCase2309 {
    public static void main(String[] args) {
        Solution solution = new GreatestEnglishLetterInUpperAndLowerCase2309().new Solution();
        String lEeTcOdE = solution.greatestLetter(new String("lEeTcOdE"));
        System.out.println(lEeTcOdE);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String greatestLetter(String s) {
            int lowerSet = 0, upperSet = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isUpperCase(c)) {
                    upperSet |= 1 << (c - 'A');
                } else {
                    lowerSet |= 1 << (c - 'a');
                }
            }
            lowerSet &= upperSet;
            for (int i = 25; i >= 0; i--) {
                if (lowerSet >> i == 1) {
                    return String.valueOf((char) ('A' + i));
                }
            }
            return "";
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}