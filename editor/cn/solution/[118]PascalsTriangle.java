package editor.cn.solution;

import java.util.ArrayList;
import java.util.List;

class PascalsTriangle{
    public static void main(String[] args) {
        Solution solution = new PascalsTriangle().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> arrayLists = new ArrayList<>();
            for (int i = 0; i < numRows; i++) {
                List<Integer> list = new ArrayList<>();
                for (int j = 0; j <= i; j++) {
                    if(j == 0 || j == i){
                        list.add(1);
                    }else {
                        list.add(arrayLists.get(i - 1).get(j - 1) + arrayLists.get(i - 1).get(j));
                    }
                }
                arrayLists.add(list);
            }
            return arrayLists;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}