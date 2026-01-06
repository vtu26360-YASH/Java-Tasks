import java.util.Scanner;

public class Array_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        System.out.println("Enter array integers:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the index of the element to retrieve:");
         int index = sc.nextInt();
        if (index >= 0 && index < n) {
            System.out.println(arr[index]);
        } else {
            System.out.println("Index out of range");
        }

        sc.close();
    }
}
