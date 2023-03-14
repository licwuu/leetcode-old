package editor.cn;

public class IntegerToRoman12 {
    public static void main(String[] args) {
        Solution solution = new IntegerToRoman12().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        String[] romanSet = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] digital = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        // 贪心
        public String intToRoman(int num) {

            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < romanSet.length; i++) {
                while (num >= digital[i]) {
                    num -= digital[i];
                    stringBuilder.append(romanSet[i]);

                }
            }
            return stringBuilder.toString();
        }
    }
//    class Solution {
//        String[] RomanSet = {"I", "V", "X", "L", "C", "D", "M"};
//        public String intToRoman(int num) {
//            Stack<String> s = new Stack<>();
//            for (int i = 0; num > 0; i++) {
//                int digital = num % 10;
//                s.add(i2R(digital, i));
//                num /= 10;
//            }
//            StringBuilder stringBuilder = new StringBuilder();
//            while (!s.isEmpty()){
//                stringBuilder.append(s.pop());
//            }
//            return stringBuilder.toString();
//        }
//        private String i2R(int num, int pow){
//            StringBuilder stringBuilder = new StringBuilder();
//            switch (num){
//                case 1:
//                    stringBuilder.append(RomanSet[pow * 2]);
//                    break;
//                case 2:
//                    stringBuilder.append(RomanSet[pow * 2]).append(RomanSet[pow * 2]);
//                    break;
//                case 3:
//                    stringBuilder.append(RomanSet[pow * 2]).append(RomanSet[pow * 2]).append(RomanSet[pow * 2]);
//                    break;
//                case 4:
//                    stringBuilder.append(RomanSet[pow * 2]).append(RomanSet[pow * 2 + 1]);
//                    break;
//                case 5:
//                    stringBuilder.append(RomanSet[pow * 2 + 1]);
//                    break;
//                case 6:
//                    stringBuilder.append(RomanSet[pow * 2 + 1]).append(RomanSet[pow * 2]);
//                    break;
//                case 7:
//                    stringBuilder.append(RomanSet[pow * 2 + 1]).append(RomanSet[pow * 2]).append(RomanSet[pow * 2]);
//                    break;
//                case 8:
//                    stringBuilder.append(RomanSet[pow * 2 + 1]).append(RomanSet[pow * 2]).append(RomanSet[pow * 2]).append(RomanSet[pow * 2]);
//                    break;
//                case 9:
//                    stringBuilder.append(RomanSet[pow * 2]).append(RomanSet[pow * 2 + 2]);
//                    break;
//            }
//            return stringBuilder.toString();
//        }
//    }

    //leetcode submit region end(Prohibit modification and deletion)

}
