package editor.cn.solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Triangle{
    public static void main(String[] args) {
        Solution solution = new Triangle().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        public int minimumTotal(List<List<Integer>> triangle) {
            List<Integer> topRowMin = new ArrayList<>();
            topRowMin.add(triangle.get(0).get(0));
            for (int i = 1; i < triangle.size(); i++) {
                List<Integer> curRowMin = new ArrayList<>();
                for (int j = 0; j <= i ; j++) {
                    int val = triangle.get(i).get(j);
                    if(j == 0){
                        curRowMin.add(topRowMin.get(j) + val);
                    }else if(j == i){
                        curRowMin.add(topRowMin.get(j - 1) + val);
                    }
                    else {
                        curRowMin.add(
                                Integer.min(topRowMin.get(j - 1), topRowMin.get(j)) + val
                        );
                    }
                }
                topRowMin = curRowMin;
            }
            return Collections.min(topRowMin);
        }

    }
    //leetcode submit region end(Prohibit modification and deletion)

}