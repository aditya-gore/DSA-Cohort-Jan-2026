package Step_0._2_ArraysAndArrayLists;
//Sum of pairs using two arrays
public class Lecture8 {
    public static void main(String[] args) {
        int [] arr1={1,2,3};
        int [] arr2={4,5,6};
        int n=arr1.length;
        int m=arr2.length;

        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum+=arr1[i]+arr2[j];
            }
        }
        System.out.println(sum);
    }
}
