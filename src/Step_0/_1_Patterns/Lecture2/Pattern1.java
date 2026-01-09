package Step_0._1_Patterns.Lecture2;
/*
for n=3
pattern is
1
2 2
3 3 3

for n=5
pattern is
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
now print for n=6!!
*/
public class Pattern1 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
