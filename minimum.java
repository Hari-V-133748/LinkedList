import java.util.*;
public class minimum {
    public static void main(String[] args) {
         // initialization the input in array
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        // assign the first value as minimum
        int min=arr[0];
        //checking the minimum
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        // print the minimum value 
        System.out.println("Minimum in array is : "+min);

    }
    
}

