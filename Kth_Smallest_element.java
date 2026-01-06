import java.util.Scanner;
import java.util.*;

public class Kth_Smallest_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12, 34, 56, 78, 90, 23, 45, 67, 89, 10};
        int k=sc.nextInt();
        Arrays.sort(arr);
        System.out.println("Kth smallest element is: " + arr[k-1]);
        sc.close();
    }
}
    
