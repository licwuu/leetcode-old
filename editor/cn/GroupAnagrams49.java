package editor.cn;

import java.util.*;

public class GroupAnagrams49 {
    public static void main(String[] args) {
        Solution solution = new GroupAnagrams49().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        private Map<String, List<String>> map = new HashMap<>();
        public List<List<String>> groupAnagrams(String[] strs) {
            for (int i = 0; i < strs.length; i++) {
                String newStr = sortString(strs[i]);
                if (map.containsKey(newStr)) {
                    map.get(newStr).add(strs[i]);
                } else {
                    ArrayList<String> list = new ArrayList<>();
                    list.add(strs[i]);
                    map.put(newStr, list);
                }
            }
            ArrayList<List<String>> ans = new ArrayList<>();
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                ans.add(entry.getValue());
            }
            return ans;
        }
        private String sortString(String str){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            StringBuilder stringBuilder = new StringBuilder();
            for (char c : chars) {
                stringBuilder.append(c);
            }
            return stringBuilder.toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}