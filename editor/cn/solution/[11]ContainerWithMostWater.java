package editor.cn.solution;

class ContainerWithMostWater{
    public static void main(String[] args) {
        Solution solution = new ContainerWithMostWater().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxArea(int[] height) {
            int l = 0, r = height.length - 1;
            int ans = 0;
            while (l < r){
                ans = Math.max(ans, (r - l) * Math.min(height[l], height[r]));
                if (height[l] < height[r] ) l++;
                else r--;
            }
            return ans;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}