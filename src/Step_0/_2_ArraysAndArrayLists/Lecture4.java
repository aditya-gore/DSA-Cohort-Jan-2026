package Step_0._2_ArraysAndArrayLists;
//sum of even numbers and odd numbers in an array
public class Lecture4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum_even=0;
        int sum_odd=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0) {
                sum_even += arr[i];
            } else {
                sum_odd += arr[i];
            }
        }
        System.out.println("sum_even = " + sum_even);
        System.out.println("sum_odd = " + sum_odd);
    }
}
