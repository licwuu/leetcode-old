package com.licw.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 *
 * @author licw
 * @version V1.0.0
 * @date 2023/3/3 20:11
 */
public class MakingFileNamesUnique {
    public static void main(String[] args) {
        Solution solution = new MakingFileNamesUnique().new Solution();
        String[] folderNames = solution.getFolderNames(new String[]{
                "kaido","kaido(1)","kaido","kaido(1)","kaido(2)"
        });
        for (int i = 0; i < folderNames.length; i++) {
            System.out.println(folderNames[i]);
        }
    }
    class Solution {

        public String[] getFolderNames(String[] names) {
            Map<String, Integer> map = new HashMap<>();
            String[] ans = new String[names.length];

            for (int i = 0; i < names.length; i++) {
                String name = names[i];
                // 如果map中有存在name， 结尾加(k)
                if(map.containsKey(name)){
                    int k = map.get(name);

                    ans[i] = name + "(" + k + ")";
                    while (map.containsKey(ans[i])){
                        k++;
                        ans[i] = name + "(" + k + ")";
                    }
                    map.put(name, k + 1);
                    map.put(ans[i], 1);
                }
                // 如果不存在
                else {
                    map.put(name, 1);
                    ans[i] = name;
                }
            }
            return ans;
        }

    }
}
