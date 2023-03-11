package editor.cn.solution;

import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        ArrayList<Integer> ans = new ArrayList<>();
        int r = k;
        while (r < arr.length){
            if(arr[r] == arr[r - k] || Math.abs(arr[r] - x) < Math.abs(arr[r - k] - x)){
                r++;
            }else {
                break;
            }
        }

        for (int i = r - k; i < r; i++) {
            ans.add(arr[i]);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
