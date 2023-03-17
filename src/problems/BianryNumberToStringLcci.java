package problems;

public class BianryNumberToStringLcci {
    static class Solution {
        public String printBin(double num) {
            StringBuilder sb = new StringBuilder("0.");
            for (int i = 0; i <= 32; i++) {
                num *= 2;
                int digital = (int) num;
                num -= digital;
                sb.append(digital);
                if (num == 0) {
                    break;
                }
            }
            return sb.length() <= 34 ? sb.toString() : "ERROR";
        }
    }

    public static void main(String[] args) {
        BianryNumberToStringLcci.Solution solution = new BianryNumberToStringLcci.Solution();
        String s = solution.printBin(0.1);
        System.out.println(s);
    }

}
