package editor.cn.solution;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int curCnt = 0, r = 0;

        for(; r < k; r++){
            if(blocks.charAt(r) == 'W'){
                ++curCnt;
            }
        }

        int MinCnt = curCnt;
        while (r < n){
            if(blocks.charAt(r - k) == 'W'){
                curCnt--;
            }
            if(blocks.charAt(r) == 'W'){
                curCnt++;
            }

            MinCnt = Math.min(MinCnt, curCnt);
            r++;
        }

        return MinCnt;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
