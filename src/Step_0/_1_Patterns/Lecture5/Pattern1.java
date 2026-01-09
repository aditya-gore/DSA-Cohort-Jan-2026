package Step_0._1_Patterns.Lecture5;

import java.util.Scanner;

/*
* Q1. Print the following pattern for the given number of rows.
The dots represent spaces.
Constraints :
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
....1
...232
..34543
.4567654
567898765
*/
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n = sc.nextInt();
        for (int row = 0; row < n; row++) {
            //1. print the dots, 0 to n-row-1
            for (int dots = 0; dots < n-row-1; dots++) {
                System.out.print(".");
            }
            //2. print the increasing numbers, 0 to row, num = row+1
            int num = row + 1;
            for (int inc = 0; inc <= row ; inc++) {
                System.out.print(num++);
            }
            //3. print the decreasing numbers, 0 to < row, num = num-2
            for (int dec = 0; dec < row; dec++) {
                System.out.print(num--);
            }
            System.out.println();
        }
        sc.close();
    }
}
