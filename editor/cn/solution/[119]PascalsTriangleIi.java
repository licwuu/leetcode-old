package editor.cn.solution;

import java.util.ArrayList;
import java.util.List;

class PascalsTriangleIi{
    public static void main(String[] args) {
        Solution solution = new PascalsTriangleIi().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> topRow = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    list.add(1);
                }else {
                    list.add(topRow.get(j - 1) + topRow.get(j));
                }
            }
            topRow = list;
        }
        return topRow;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}