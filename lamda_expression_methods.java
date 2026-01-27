import java.util.*;

interface PerformOperation {
    boolean check(int a);
}

public class lamda_expression_methods {

    public static PerformOperation isOdd() {
        return a -> (a & 1) == 1;   // faster than %
    }

    public static PerformOperation isPrime() {
        return a -> {
            if (a <= 1) return false;
            if (a == 2) return true;
            if ((a & 1) == 0) return false;

            for (int i = 3; i * i <= a; i += 2) {
                if (a % i == 0) return false;
            }
            return true;
        };
    }

    public static PerformOperation isPalindrome() {
        return x -> {
            if (x < 0 || (x % 10 == 0 && x != 0)) return false;

            int rev = 0;
            while (x > rev) {
                rev = rev * 10 + x % 10;
                x /= 10;
            }
            return x == rev || x == rev / 10;
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int type = sc.nextInt();
            int num = sc.nextInt();

            switch (type) {
                case 1:
                    System.out.println(isOdd().check(num) ? "ODD" : "EVEN");
                    break;
                case 2:
                    System.out.println(isPrime().check(num) ? "PRIME" : "COMPOSITE");
                    break;
                case 3:
                    System.out.println(isPalindrome().check(num) ? "PALINDROME" : "NOT PALINDROME");
                    break;
            }
        }
        sc.close();
    }
}
