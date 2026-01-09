package Step_0._1_Patterns.Lecture6;

import java.util.Scanner;

/*
Input: 4
Output:
4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4
*/
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n = sc.nextInt();
        printSquare(n);
        sc.close();
    }
    static void printSquare(int n) {
        int size = 2*n-1;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                int top = row;
                int left = col;
                int right = size-1-col;
                int bottom = size-1-row;

                int minDist = Math.min(
                        Math.min(top, bottom),
                        Math.min(right,left)
                );
                int value = n - minDist;
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
/*
Note -
Whenever you see:
• concentric squares
• decreasing numbers toward center
• symmetrical grid

Think: distance from borders
*/