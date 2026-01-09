package Step_0._1_Patterns.Lecture1;
/*
1.create  the given pattern
000000
000000
000000
000000
*/
public class Pattern1 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(0);
            }
            System.out.println();
        }
    }
}
