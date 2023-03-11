package editor.cn.solution;

class FirstBadVersion{
    public static void main(String[] args) {
        Solution solution = new FirstBadVersion().new Solution();
    }
    public class VersionControl{
        public boolean isBadVersion(int n){
            return true;
        }
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    /* The isBadVersion API is defined in the parent class VersionControl.
          boolean isBadVersion(int version); */

    public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int l = 1, r = n;
            while (l < r){
                int m = (r - l)/2 + l;
                System.out.println(m);
                if(isBadVersion(m)){
                    r = m;
                }else {
                    l = m + 1;
                }
            }
            return l;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    }