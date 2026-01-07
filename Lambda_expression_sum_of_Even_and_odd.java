@FunctionalInterface
interface SumCalculator {
    int compute(int a, int b);
}


public class Lambda_expression_sum_of_Even_and_odd {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        
        
        SumCalculator evenLogic = (currentSum, nextNum) -> (nextNum % 2 == 0) ? currentSum + nextNum : currentSum;

        
        SumCalculator oddLogic = (currentSum, nextNum) -> (nextNum % 2 != 0) ? currentSum + nextNum : currentSum;

        
        int evenSum = 0;
        int oddSum = 0;

        for (int n : numbers) {
            evenSum = evenLogic.compute(evenSum, n); 
            oddSum = oddLogic.compute(oddSum, n);  
        }

        System.out.println("Total Sum of Evens: " + evenSum);
        System.out.println("Total Sum of Odds: " + oddSum);
    }
}