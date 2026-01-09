package Step_0._1_Patterns.Lecture8;

import java.util.Scanner;

/*
* Sum Pattern
Write a program to print triangle of user defined integers sum.
Constraints :
0 <= N <= 50
Sample Input :
5
Sample Output :
1=1
1+2=3
1+2+3=6
1+2+3+4=10
1+2+3+4+5=15
*/
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n = sc.nextInt();
        for (int row = 0; row < n; row++) {
            int sum = 0;
            for (int num = 1; num <= row+1; num++) {
                sum += num;
                System.out.print(num);
                if(num < row+1) System.out.print("+");
            }
            System.out.print("=");
            System.out.println(sum);
        }
        sc.close();
    }
}
/*
Not all patterns are grid-based.
Some patterns are logical sequences with formatting.
Whenever you see:
• =
• running total
• arithmetic meaning
Think calculation first, printing second
* */