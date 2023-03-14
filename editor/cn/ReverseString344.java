package editor.cn;

public class ReverseString344 {
    public static void main(String[] args) {
        Solution solution = new ReverseString344().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void reverseString(char[] s) {
            int i = 0, j = s.length - 1;
            while (i < j) swap(s, i++, j--);
        }

        private void swap(char[] array, int i, int j) {
            char tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}