package problems;

import java.util.HashMap;
import java.util.Map;

public class MakingFileNamesUnique {
    static class Solution {
        public String[] getFolderNames(String[] names) {
            Map<String, Integer> map = new HashMap<>();
            String[] ans = new String[names.length];
            for (int i = 0; i < names.length; i++) {
                if (map.containsKey(names[i])) {
                    int k = map.get(names[i]) + 1;
                    map.put(names[i], k);
                    ans[i] = names[i] + '(' + k + ')';
                } else {
                    String name = names[i];
                    if (isNum(name)) {
                        map.put(name, 0);
                        String subName = name.substring(0, name.length() - 3);
                        int k = 0;
                        if (map.containsKey(subName)) {
                            k = map.get(subName) + 1;
                        }
                        k = Math.max(k, name.charAt(name.length() - 2) - '0');

                        map.put(subName, k);
                        ans[i] = name;
                        if (k != 0 && isNum(name)) {
                            ans[i] = subName + '(' + k + ')';
                        }
                    } else {
                        map.put(name, 0);
                        ans[i] = name;
                    }
                }
            }
            return ans;
        }

        public boolean isNum(String name) {
            if (name.length() > 3
                    && name.charAt(name.length() - 1) == ')'
                    && name.charAt(name.length() - 3) == '('
            ) {
                char c = name.charAt(name.length() - 2);
                if (c >= '0' && c <= '9') {
                    return true;

                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        String[] ans = new Solution().getFolderNames(new String[]{"kaido", "kaido(1)", "kaido", "kaido(1)"});
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
