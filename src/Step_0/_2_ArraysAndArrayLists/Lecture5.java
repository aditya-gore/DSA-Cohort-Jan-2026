package Step_0._2_ArraysAndArrayLists;
//sum of even index and odd index in an array
public class Lecture5 {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6};
        int even_ind_sum=0;
        int odd_ind_sum=0;

        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                even_ind_sum+=arr[i];
            }else{
                odd_ind_sum+=arr[i];
            }
        }
        System.out.print(even_ind_sum+" "+odd_ind_sum+"\n");
        System.out.println("---"+odd_ind_sum);
    }
}
