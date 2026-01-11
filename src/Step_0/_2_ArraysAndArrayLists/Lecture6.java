package Step_0._2_ArraysAndArrayLists;
//Sum of pairs using single array
public class Lecture6 {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6};
        int sum=0;
        int n= arr.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                sum+=arr[i]+arr[j];
            }
        }
        System.out.println("Total pair sum is :" + " "+sum);
    }
}
