import java.util.Scanner;

public class Maximum_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){  
            if(arr[i]>max){  
                max=arr[i];  
            }  
        }System.out.println("Maximum element is: " + max);
        sc.close();
    }
}
