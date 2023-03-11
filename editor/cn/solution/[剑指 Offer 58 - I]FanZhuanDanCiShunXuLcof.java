package editor.cn.solution;

import java.util.ArrayList;
import java.util.List;

class FanZhuanDanCiShunXuLcof{
    public static void main(String[] args) {
        Solution solution = new FanZhuanDanCiShunXuLcof().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseWords(String s) {
        int len = s.length();
        List<String> stringList = new ArrayList<>();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if(c != ' '){
                stringBuffer.append(c);
                if(i == len - 1) {
                    stringList.add(stringBuffer.toString());
                    stringBuffer.setLength(0);
                }
            } else if(stringBuffer.length() > 0){
                stringList.add(stringBuffer.toString());
                stringBuffer.setLength(0);
            }
        }
        for (int i = stringList.size() - 1; i >= 0 ; i--) {
            stringBuffer.append(stringList.get(i));
            if(i != 0) stringBuffer.append(' ');
        }
        return stringBuffer.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}