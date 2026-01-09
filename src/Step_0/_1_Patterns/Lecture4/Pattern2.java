package Step_0._1_Patterns.Lecture4;

import java.util.Scanner;

/*
* Q2. Print the following pattern for the given N number of rows.
Constraints :
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
55555
4444
333
22
1
*/
public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        sc.close();
    }
}
