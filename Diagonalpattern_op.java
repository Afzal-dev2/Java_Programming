import java.util.Scanner;

public class Diagonalpattern_op {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String st = s.next();
        s.close();
        for (int i = 0; i < st.length(); i++) {
            for (int j = 0; j < st.length(); j++) {
                if (i + j == st.length() - 1) {
                    System.out.print(st.charAt(j));

                } else if (i == j) {
                    System.out.print(st.charAt(i));

                } else
                    System.out.print(" ");

            }
            System.out.println();
        }

    }
}
