import java.util.Scanner;

public class Binary_search_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to search:");
        int[] arr = {2, 4, 6, 8, 10};       
        int key = sc.nextInt();
        int low = 0;
        int high = arr.length - 1;
        boolean found = false;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found at index " + mid);
                found = true;
                break;
            } 
            else if (key < arr[mid]) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
        sc.close();
    } 
}
