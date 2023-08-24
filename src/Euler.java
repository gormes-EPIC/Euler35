
public class Euler {
    public static long multiplesThreesFives(long n) {
        long mult3 = (n - 1) / 3;
        long mult5 = (n - 1) / 5;
        long mult15 = (n - 1) / 15;
        long sum = 3 * mult3 * (mult3 + 1) / 2 + 5 * mult5 * (mult5 + 1) / 2 - 15 * mult15 * (mult15 + 1) / 2;
        return(sum);

    }
    public static long multiplesThreesFivesWorse(long n) {
        long totalSum = 0;

        for (long num = 0; num < n; num++) {
            if (num % 3 == 0 || num % 5 == 0) {
                totalSum += num;
            }
        }

        return totalSum;
    }
}
