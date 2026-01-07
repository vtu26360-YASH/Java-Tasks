import java.util.Arrays;
import java.util.List;


@FunctionalInterface
interface NumberCheck {
    boolean test(int n); 
}


public class StreamLambdaSum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 3. LAMBDA EXPRESSION
        
        NumberCheck isEven = (n) -> n % 2 == 0;
        NumberCheck isOdd = (n) -> n % 2 != 0;

        // 4. CALL LAMBDA (Inside the Stream)
        int evenSum = numbers.stream()
                .filter(isEven::test) 
                .mapToInt(Integer::intValue)
                .sum();

        int oddSum = numbers.stream()

                .filter(n -> isOdd.test(n)) 
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Numbers: " + numbers);
        System.out.println("Sum of Even: " + evenSum);
        System.out.println("Sum of Odd: " + oddSum);
    }
}