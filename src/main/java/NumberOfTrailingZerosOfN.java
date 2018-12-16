public class NumberOfTrailingZerosOfN {
    public static void main(String[] args) {
        System.out.println(zeros(126));
    }

    public static int zeros(int n) {
        Integer findPow = 0;
        Integer temp = 5;
        int counter = 0;
        do {
            temp = temp * 5;
            findPow++;
        } while (temp < n);
        for (int i = 1; i <= findPow; i++) {
            double power = Math.pow(5, i);
            counter += n / power;
        }
        return counter;
    }
}
