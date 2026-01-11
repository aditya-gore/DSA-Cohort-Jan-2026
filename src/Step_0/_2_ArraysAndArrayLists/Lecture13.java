package Step_0._2_ArraysAndArrayLists;
//Prime numbers between range
public class Lecture13 {
    public static void main(String[] args) {
        int n=50;

        for(int i=1;i<=n;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.print(i+" ");
            }
        }
    }
}
