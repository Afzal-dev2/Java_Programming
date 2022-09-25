//Given a matrix m1 and m2, 
//let m3 be the transpose of m2 and find whether m3 is present in m1.
//If present print 1, else print -1

import java.util.Arrays;
import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int w, q;
        int m = s.nextInt();
        int n = s.nextInt();
        boolean flag = false;
        int count = 0;
        char m1[][] = new char[m][n];

        //getting m1 matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                m1[i][j] = s.next().charAt(0);
            }
        }

        int o = s.nextInt();
        char m2[][] = new char[o][o];

        //getting m2 matrix
        for (int z = 0; z < o; z++) {
            for (int x = 0; x < o; x++) {
                m2[z][x] = s.next().charAt(0);
            }
        }
        //printing both the matrices for reference
        System.out.println(Arrays.deepToString(m1));
        System.out.println(Arrays.deepToString(m2));

        char m2_transpose[][] = new char[m][n];

        // finding the transpose
        for (int i = 0; i < o; i++) {
            for (int j = 0; j < o; j++) {
                m2_transpose[i][j] = m2[j][i];
            }
        }
        // Pattern matching
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                // check if the 1st element of m3 is present in m1
                if (m1[i][j] == m2_transpose[0][0] && count != o) {
                    flag = false;

                    // if 1st element matches, then check the remaining elements of m3 with m1 matrix
                    q = 0;
                    w = 0;

                    //iterate through m3 matrix and check
                    for (int j2 = 0; j2 < o; j2++) {
                        for (int k = 0; k < o; k++) {
                            if (m1[i + q][j + w] != m2_transpose[j2][k]) {

                                //set flag to true if the subsequent element mismatches 
                                //and break the loop
                                flag = true;
                                break;
                            }

                            //modify w and q variables, so that the row and column index positions won't exceed than
                            //the m3 matrix row and column count
                            if (w < o && w != o)
                                w++;
                            if (w == o) {
                                w = 0;
                                q++;
                            }
                        }

                        //if mismatch found, break the loop
                        if (flag == true) {
                            break;
                        }
                        //increment count
                        count++;
                    }

                }
            }
        }

        // if flag is true then, m3 is not present in m1.
        if (flag)
            System.out.println(-1);

        else
            System.out.println(1);

        s.close();
    }
}
