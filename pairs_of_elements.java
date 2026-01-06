public class pairs_of_elements {
    public static void main(String[] args) {

        
        int[] arr = {1, 2, 3};

        int n = arr.length;

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("(" + arr[i] + ", " + arr[j] + ")");
            }
        }
    }
}
