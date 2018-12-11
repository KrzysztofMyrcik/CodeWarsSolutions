public class FindOdd {
    public static int findIt(int[] a) {
        int counter = 0;
        int odd = 0;
        for (int i = 0; i < a.length; i++) {
            if (counter % 2 != 0) {
                return odd;
            }
            counter = 0;
            int temp = a[i];
            for (int j = 0; j < a.length; j++) {
                int temp2 = a[j];
                if (temp == temp2) {
                    counter++;
                    odd = temp;
                }
            }
        }
        return odd;
    }
}