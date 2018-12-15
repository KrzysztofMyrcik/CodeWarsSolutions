import java.util.ArrayList;
import java.util.List;

public class Conversion {
    public static String solution(int n) {
        Integer number = n;
        String numToString = number.toString();
        List<Integer> numberList = new ArrayList<>();
        StringBuilder converted = new StringBuilder();
        for (int i = 0; i < numToString.length(); i++) {
            numberList.add((Character.getNumericValue(numToString.charAt(i))));
        }
        for (int i = 0; i < numberList.size(); i++) {
            thousands(numberList, converted, i);
            hundredsOf(numberList, converted, i);
            dozens(numberList, converted, i);
            units(numberList, converted, i);
        }
        return converted.toString();
    }

    private static void units(List<Integer> numberList, StringBuilder converted, int i) {
        if (numberList.size() > 0) {
            if (numberList.get(0) == 4) {
                converted.append("IV");
            }
            if (numberList.get(0) == 9) {
                converted.append("IX");
            }
            if (numberList.get(0) >= 5 && numberList.get(0) != 4 && numberList.get(0) != 9) {
                converted.append("V");
                for (int j = 5; j < numberList.get(0); j++) {
                    converted.append("I");
                }
            }
            if (numberList.get(0) < 5 && numberList.get(0) != 4 && numberList.get(0) != 9) {
                for (int j = 0; j < numberList.get(0); j++) {
                    converted.append("I");
                }
            }
            numberList.remove(i);
        }
    }

    private static void dozens(List<Integer> numberList, StringBuilder converted, int i) {
        if (numberList.size() > 1) {
            if (numberList.get(0) == 4) {
                converted.append("XL");
            }
            if (numberList.get(0) == 9) {
                converted.append("XC");
            }
            if (numberList.get(0) >= 5 && numberList.get(0) != 4 && numberList.get(0) != 9) {
                converted.append("L");
                for (int j = 5; j < numberList.get(0); j++) {
                    converted.append("X");
                }
            }
            if (numberList.get(0) < 5 && numberList.get(0) != 4 && numberList.get(0) != 9) {
                for (int j = 0; j < numberList.get(0); j++) {
                    converted.append("X");
                }
            }
            numberList.remove(i);
        }
    }

    private static void hundredsOf(List<Integer> numberList, StringBuilder converted, int i) {
        if (numberList.size() > 2) {
            if (numberList.get(0) == 4) {
                converted.append("CD");
            }
            if (numberList.get(0) == 9) {
                converted.append("CM");
            }
            if (numberList.get(0) >= 5 && numberList.get(0) != 4 && numberList.get(0) != 9) {
                converted.append("D");
                for (int j = 5; j < numberList.get(0); j++) {
                    converted.append("C");
                }
            }
            if (numberList.get(0) < 5 && numberList.get(0) != 4 && numberList.get(0) != 9) {
                for (int j = 0; j < numberList.get(0); j++) {
                    converted.append("C");
                }
            }
            numberList.remove(i);
        }
    }

    private static void thousands(List<Integer> numberList, StringBuilder converted, int i) {
        if (numberList.size() > 3) {
            for (int j = 0; j < numberList.get(0); j++) {
                converted.append("M");
            }
            numberList.remove(i);
        }
    }
}