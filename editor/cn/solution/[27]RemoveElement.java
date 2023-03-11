package editor.cn.solution;

class RemoveElement{
    public static void main(String[] args) {
        Solution solution = new RemoveElement().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        void swap(int[] nums, int i, int j){
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        public int removeElement(int[] nums, int val) {
            int tail = nums.length;
            for(int i = 0; i < tail; i++){
                while (i < tail && nums[i] == val){
                    swap(nums, i, tail - 1);
                    tail--;
                }
            }

            return tail;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}