package editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("all")
public class CountSubtreesWithMaxDistanceBetweenCities1617 {
    public static void main(String[] args) {
        Solution solution = new CountSubtreesWithMaxDistanceBetweenCities1617().new Solution();
        int[] ints = solution.countSubgraphsForEachDiameter(4, new int[][]{
                new int[]{1, 2},
                new int[]{2, 3},
                new int[]{2, 4}
        });
        System.out.println(ints);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        int[] ans;
        List<Integer>[] graph;
        int mask;
        int maxDeep;
        int leaf;

        public int[] countSubgraphsForEachDiameter(int n, int[][] edges) {
            ans = new int[edges.length];
            graph = new List[n];
            Arrays.setAll(graph, (k) -> new ArrayList<>());

            for (int[] edge : edges) {
                graph[edge[1] - 1].add(edge[0] - 1);
                graph[edge[0] - 1].add(edge[1] - 1);
            }

            // 枚举所有子树
            for (int i = 1; i < (1 << n); i++) {
                // 只有一个节点
                if ((i & i - 1) == 0)
                    continue;
                mask = i;
                int curNode = 31 - Integer.numberOfLeadingZeros(mask);
                maxDeep = 0;
                // 找到当前节点下最深的叶子节点leaf
                dfs(curNode, 0);
                // 所有节点都被遍历到， 证明连通
                if (mask == 0) {
                    mask = i;
                    dfs(leaf, 0);
                    ans[maxDeep - 1]++;
                }

            }
            return ans;
        }

        void dfs(int curNode, int deep) {
            // 删掉当前节点
            mask ^= 1 << curNode;
            if (deep > maxDeep) {
                maxDeep = deep;
                leaf = curNode;
            }
            for (int node : graph[curNode]) {
                if ((mask >> node & 1) == 1) {
                    dfs(node, deep + 1);
                }
            }
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}