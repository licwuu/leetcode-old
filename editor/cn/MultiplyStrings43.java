package editor.cn;


public class MultiplyStrings43 {
    public static void main(String[] args) {
        Solution solution = new MultiplyStrings43().new Solution();
        solution.multiply("123", "456");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String multiply(String num1, String num2) {
            if (num1.charAt(0) == '0' || num2.charAt(0) == '0') return "0";
            String res = "0";
            for (int i = num2.length() - 1; i >= 0; i--) {
                if (i == num2.length() - 1) res = multiplyOne(num1, num2.charAt(i), num2.length() - i - 1);
                else res = add(res, multiplyOne(num1, num2.charAt(i), num2.length() - i - 1));
            }
            return res;

        }

        private String multiplyOne(String num1, char d, int bu0) {
            StringBuilder stringBuilder = new StringBuilder();
            int jinwei = 0, chengshu = d - '0';
            for (int i = num1.length() - 1; i >= 0; i--) {
                int digtal = (chengshu * (num1.charAt(i) - '0')) + jinwei;
                stringBuilder.append(digtal % 10);
                jinwei = digtal / 10;
            }
            if (jinwei != 0) stringBuilder.append(jinwei);
            stringBuilder.reverse();
            for (int i = 0; i < bu0; i++) {
                stringBuilder.append('0');
            }
            return stringBuilder.toString();
        }

        private String add(String num1, String num2) {
            StringBuilder stringBuilder = new StringBuilder();
            int jinwei = 0;
            int i = 0;
            while (i < num1.length() && i < num2.length()) {
                int digital = num1.charAt(num1.length() - 1 - i) - '0' + num2.charAt(num2.length() - 1 - i) - '0' + jinwei;
                stringBuilder.append(digital % 10);
                jinwei = digital / 10;
                i++;
            }
            while (i < num1.length()) {
                int digital = num1.charAt(num1.length() - 1 - i) - '0' + jinwei;
                stringBuilder.append(digital % 10);
                jinwei = digital / 10;
                i++;
            }
            while (i < num2.length()) {
                int digital = num2.charAt(num2.length() - 1 - i) - '0' + jinwei;
                stringBuilder.append(digital % 10);
                jinwei = digital / 10;
                i++;
            }
            if (jinwei != 0) stringBuilder.append('1');
            return stringBuilder.reverse().toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}