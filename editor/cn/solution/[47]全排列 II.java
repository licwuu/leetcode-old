package editor.cn.solution;//给定一个可包含重复数字的序列 nums ，按任意顺序 返回所有不重复的全排列。
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,1,2]
//输出：
//[[1,1,2],
// [1,2,1],
// [2,1,1]]
// 
//
// 示例 2： 
//
// 
//输入：nums = [1,2,3]
//输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 8 
// -10 <= nums[i] <= 10 
// 
//
// Related Topics 数组 回溯 👍 1305 👎 0


import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    private List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            numList.add(nums[i]);
        }
        findAns(numList, new ArrayList<>());
        return ans;
    }

    public void findAns(ArrayList<Integer> nums, ArrayList<Integer> arr){
        if(nums.size() == 0){
            ans.add(new ArrayList<>(arr));

            return;
        }
        for(int i = 0; i < nums.size(); i++){
            if(i > 0 && Objects.equals(nums.get(i), nums.get(i - 1))) continue;
            int e = nums.get(i);
            arr.add(e);
            nums.remove(i);
            findAns(nums, arr );
            arr.remove(arr.size() - 1);
            nums.add(i, e);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
