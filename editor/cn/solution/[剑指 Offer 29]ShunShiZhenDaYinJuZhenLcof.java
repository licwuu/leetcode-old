package editor.cn.solution;

class ShunShiZhenDaYinJuZhenLcof{
    public static void main(String[] args) {
        Solution solution = new ShunShiZhenDaYinJuZhenLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] spiralOrder(int[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0){
            return new int[0];
        }
        int top = 0, right = matrix[0].length - 1, bottom = matrix.length - 1, left = 0; //边界
        int pos = 0;
        int[] ans = new int[(right + 1) * (bottom + 1)];
        while(true){
            for(int i = left; i <= right;i++) ans[pos++] = matrix[top][i];//向右
            if(++top > bottom) break;
            for (int i = top; i <= bottom; i++) ans[pos++] = matrix[i][right];//向下
            if(--right < left) break;
            for (int i = right; i >= left; i--) ans[pos++] = matrix[bottom][i]; //向左
            if(--bottom < top) break;
            for (int i = bottom; i >= top ; i--) ans[pos++] = matrix[i][left];//向上
            if(++left > right) break;

        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}