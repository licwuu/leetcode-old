package editor.cn.solution;

class DiYiGeZhiChuXianYiCiDeZiFuLcof{
    public static void main(String[] args) {
        Solution solution = new DiYiGeZhiChuXianYiCiDeZiFuLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public char firstUniqChar(String s) {
            int len = s.length();
            //值为0表示没有出现过，小于0表示出现过多次，大于0表示出现过一次，值为出现的位置(从1开始计算）
            int[] cPos = new int[26];
            for (int i = 0; i < len; i++) {
                int tmp = s.charAt(i) - 'a';
                if(cPos[tmp] > 0) cPos[tmp] = -1;
                if(cPos[tmp] == 0) cPos[tmp] = i + 1;
            }
            int ansIndex = len + 1;
            for (int i = 0; i < 26; i++) {
//                System.out.println((char) (i + 'a') + ":" + cPos[i]);
                if(cPos[i] > 0 && cPos[i] - 1 < ansIndex) ansIndex = cPos[i] - 1;
            }
            return ansIndex == len + 1 ? ' ' : s.charAt(ansIndex);
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}