package YiJi;

import java.util.Arrays;
import java.util.Scanner;


 
public class no1019 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            String n = in.next();
            if (K(n)[2] == 0) {
                System.out.println(n + " - " + n + " = " + "0000");
            } else {
                while (K(n)[2] != 6174) {
                    System.out.printf("%04d - %04d = %04d\n", K(n)[0], K(n)[1],
                            K(n)[2]);
                    n = K(n)[2] + "";
                }
                System.out.printf("%04d - %04d = %04d\n", K(n)[0], K(n)[1],
                        K(n)[2]);
            }
        } finally {
            in.close();
        }
 
    }
 
    public static int[] K(String n) {
        while (n.length() < 4) {
            n = "0" + n;
        }
        int[] l = new int[4];
        for (int i = 0; i < 4; i++) {
            l[i] = n.charAt(i) - '0';
        }
        Arrays.sort(l);
        int n1 = l[3] * 1000 + l[2] * 100 + l[1] * 10 + l[0];
        int n2 = l[0] * 1000 + l[1] * 100 + l[2] * 10 + l[3];
        int[] k = { n1, n2, n1 - n2 };
        return k;
    }
}
