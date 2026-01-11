package Step_0._2_ArraysAndArrayLists;
//Print the boundary elements
public class Lecture19 {
    public static void main(String[] args) {
        int [][] arr={{1,2,3,4},{5,6,7,8},{6,7,8,9}};
        int row= arr.length;
        int col= arr[0].length;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0 || j==0 || i==row-1 || j==col-1){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}
