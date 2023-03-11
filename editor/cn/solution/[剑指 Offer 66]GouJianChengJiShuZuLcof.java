package editor.cn.solution;

class GouJianChengJiShuZuLcof{
    public static void main(String[] args) {
        Solution solution = new GouJianChengJiShuZuLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] constructArr(int[] a) {
        int[] pre = new int[a.length], post = new int[a.length];
        for(int i = 0; i < a.length; i++){
            if(i == 0) pre[i] = 1;
            else pre[i] = pre[i - 1] * a[i - 1];
        }
        for(int i = a.length - 1; i >= 0; i--){
            if(i == a.length - 1) post[i] = 1;
            else post[i] = post[i + 1] * a[i + 1];
        }
        for(int i = 0; i < a.length; i++){
            pre[i] *= post[i];
        }
        return pre;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}