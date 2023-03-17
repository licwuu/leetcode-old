package problems;

import java.util.Scanner;

public class help {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int x = 'A' - 'a';
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i == 0) {
                c += x;
                stringBuilder.append(c);
            } else if (c == '-') {
                c = str.charAt(++i);
                c += x;
                stringBuilder.append(c);
            } else {
                stringBuilder.append(c);

            }
        }
        System.out.println(stringBuilder.toString());
    }
}
