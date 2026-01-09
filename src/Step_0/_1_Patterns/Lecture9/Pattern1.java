package Step_0._1_Patterns.Lecture9;
/*
-------
 ******
 *****
 ****
 ***
 **
 *
------
* */
public class Pattern1 {
    public static void main(String[] args) {
        for(int i=0;i<6;i++) {
            for(int j=0;j<6-i;j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
