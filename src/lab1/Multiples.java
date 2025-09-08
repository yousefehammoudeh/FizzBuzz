package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples(1000,3,5));
    }

    static int multiples(int n, int a, int b) {
        int count=0;
        for (int i = 1; i < n; i++) {
            boolean isDivisibleBy5 = i % b == 0;
            boolean isDivisibleBy3 = i % a == 0;

            if (isDivisibleBy5 || isDivisibleBy3) {
                count++;
            }
        }
        return count;
    }
}
