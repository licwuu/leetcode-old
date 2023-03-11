package editor.cn.solution;

class AddBinary{
    public static void main(String[] args) {
        Solution solution = new AddBinary().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        int bit = 0;
        char add(char a, char b){
            char res = (a - '0' + b - '0' + bit) % 2 == 0 ? '0' : '1';
            bit = (a - '0' + b - '0' + bit) /2;
            return res;
        }
        public String addBinary(String a, String b) {
            StringBuilder stringBuilder = new StringBuilder();
            int posA = a.length() - 1, posB = b.length() - 1;
            while (posA >= 0 && posB >= 0){
                stringBuilder.append(add(a.charAt(posA), b.charAt(posB)));
                posA--;
                posB--;
            }
            while (posA >= 0){
                stringBuilder.append(add(a.charAt(posA), '0'));
                posA--;
            }
            while (posB >= 0){
                stringBuilder.append(add(b.charAt(posB), '0'));
                posB--;
            }
            if(bit == 1) stringBuilder.append('1');
            return stringBuilder.reverse().toString();
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}