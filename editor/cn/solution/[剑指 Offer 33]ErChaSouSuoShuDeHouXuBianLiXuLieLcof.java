package editor.cn.solution;

class ErChaSouSuoShuDeHouXuBianLiXuLieLcof{
    public static void main(String[] args) {
        Solution solution = new ErChaSouSuoShuDeHouXuBianLiXuLieLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean verifyHelper(int[] postorder, int s, int e){

            if(e - s < 2) return true;
            int m = -1;
            for(int i = s; i < e; i ++){
                if(postorder[i] > postorder[e]){
                    if(m == -1) m = i;
                }else if(m != -1){
                    return false;
                }
            }
            if(m == -1) m = e;
//            System.out.println("s:" + s + "    e:" + e + "    m:" + m);
            return verifyHelper(postorder, s, m - 1) && verifyHelper(postorder, m, e - 1);
        }

        public boolean verifyPostorder(int[] postorder) {
            return verifyHelper(postorder, 0 , postorder.length - 1);
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}