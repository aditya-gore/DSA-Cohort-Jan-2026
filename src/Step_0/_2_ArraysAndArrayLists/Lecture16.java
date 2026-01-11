package Step_0._2_ArraysAndArrayLists;

import java.util.Arrays;

// Count frequency of each element
public class Lecture16 {
    public static void main(String[] args) {
        int [] arr={2,3,4,5,2,3};
        int n=arr.length;
        boolean [] vis=new boolean[n];
        Arrays.fill(vis,false);

        for(int i=0;i<n;i++){
            if(vis[i]==false){
                vis[i]=true;
                int count=1;
                for(int j=i+1;j<n;j++){
                    if(arr[i]==arr[j]){
                        vis[j]=true;
                        count++;
                    }
                }
                System.out.println(arr[i]+"->"+count);
            }
        }
    }
}
