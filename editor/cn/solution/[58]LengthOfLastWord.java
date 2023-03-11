package editor.cn.solution;

class LengthOfLastWord{
    public static void main(String[] args) {
        Solution solution = new LengthOfLastWord().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLastWord(String s) {
        int tail = s.length() - 1;
        while (s.charAt(tail) == ' ') tail--;
        int front = tail;
        while (front >= 0 && s.charAt(front) != ' ') front--;
//        System.out.println(tail + " " + front);
        return tail - front;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}