package editor.cn.solution;

import java.util.*;

class ZiFuChuanDePaiLieLcof{
    public static void main(String[] args) {
        Solution solution = new ZiFuChuanDePaiLieLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        public String[] permutation(String s) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            List<String> ansList = new ArrayList<>();
            hs(chars,0, ansList, new StringBuffer());
            String[] ans = new String[ansList.size()];
            for (int i = 0; i < ans.length; i++) {
                ans[i] = ansList.get(i);
            }
            return ans;
        }
        public void  hs(char[] chars, int index, List<String> list, StringBuffer str){
            if(index == chars.length) {
                list.add(str.toString());
            }
            for(int i = 0; i < chars.length; i++){
                if(chars[i] == '\0' || (i != 0 && chars[i] == chars[i - 1])){
                    continue;
                }
                char c = chars[i];
                str.append(c);
                chars[i] = '\0';
                hs(chars, index + 1, list, str);
                chars[i] = c;
                str.deleteCharAt(index);
            }

        }

    }
    //leetcode submit region end(Prohibit modification and deletion)

}