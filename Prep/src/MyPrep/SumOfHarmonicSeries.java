package MyPrep;

public class SumOfHarmonicSeries {

    public static void main(String[] args) {
        float precision = 0.001f;
        float sum = 0;
        int num = 1;

        // Continue the loop until the term is smaller than the precision
        while (1.0f / num >= precision) {
            sum += 1.0f / num;
            num++;
        }

        System.out.println("Sum of the harmonic series: " + sum);
        System.out.println("Number of terms: " + (num - 1));
    }
}
