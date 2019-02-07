import java.util.HashMap;
import java.util.Map;
//not working
public class Keypad {
    public static void main(String[] args) {
        presses(":eCWpiKPjEK@IYOCoSXOEboF$f$");
    }

    public static int presses(String phrase) {
        phrase = phrase.toUpperCase();
        String[] array1 = {"a", "d", "g", "j", "m", "p", "t", "w", " ", "*", "#"};
        String[] array2 = {"b", "e", "h", "k", "n", "q", "u", "x","0"};
        String[] array3 = {"c", "f", "i", "l", "o", "r", "v", "y"};
        String[] array4 = {"s", "z", "1", "2", "3", "4", "5", "6" , "8"};
        String[] array5 = {"7","9"};

        Integer counter = 0;
        Map<String, Integer> one = new HashMap<>();
        Map<String, Integer> two = new HashMap<>();
        Map<String, Integer> three = new HashMap<>();
        Map<String, Integer> four = new HashMap<>();
        Map<String, Integer> five = new HashMap<>();
        for (String s : array1) {
            one.put(s.toUpperCase(), 1);
        }
        for (String s : array2) {
            two.put(s.toUpperCase(), 2);
        }
        for (String s : array3) {
            three.put(s.toUpperCase(), 3);
        }
        for (String s : array4) {
            four.put(s.toUpperCase(), 4);
        }
        for (String s : array5) {
            five.put(s.toUpperCase(), 4);
        }
        for (int i = 0; i < phrase.length(); i++) {
            Character search = phrase.charAt(i);

            if (one.containsKey(search.toString())) {
                one.get(search.toString());
                counter++;
            }
            if (two.containsKey(search.toString())) {
                two.get(search.toString());
                counter += 2;
            }
            if (three.containsKey(search.toString())) {
                three.get(search.toString());
                counter += 3;
            }
            if (four.containsKey(search.toString())) {
                four.get(search.toString());
                counter += 4;
            }
            if (five.containsKey(search.toString())) {
                four.get(search.toString());
                counter += 5;
            }

        }
        System.out.println(counter);
        return counter;
    }
}
