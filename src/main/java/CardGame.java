import java.util.LinkedHashMap;
import java.util.Map;

class CardGame {

    public static int game(String A, String B) throws RuntimeException {
        String[] array1 = {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"};
        Map<String, Integer> values = new LinkedHashMap<>();
        int counter = 0;

        if (A.length() != B.length()) {
            throw new RuntimeException("Strings should have the same length");
        }
        if (A.length() >= 1000 || B.length() >= 1000) {
            throw new RuntimeException("To long string");
        }
        for (int i = 0; i < array1.length; i++) {
            values.put(array1[i], i);
        }
        for (int i = 0; i < A.length(); i++) {
            Character tempA = A.charAt(i);
            Character tempB = B.charAt(i);
            if (tempA == tempB) {
                counter += 0;
            } else {
                if (values.get(tempA.toString().toUpperCase()) > values.get(tempB.toString().toUpperCase())) {
                    counter++;
                }
            }
        }
        return counter;
    }
}