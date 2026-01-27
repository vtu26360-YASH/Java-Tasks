import java.util.*;

public class second_highest_stream_api {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        int result = list.stream()
                .distinct()                     
                .sorted(Comparator.reverseOrder()) 
                .skip(1)                         
                .findFirst()                      
                .orElse(-1);                     

        System.out.println(result);
        sc.close();
    }
}
