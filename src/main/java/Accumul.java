
public class Accumul {
    public static String accum(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            Character tempString = s.toUpperCase().charAt(i);
            stringBuilder.append(tempString.toString());
            for (int j = 0; j < i; j++) {
                tempString = s.toLowerCase().charAt(i);
                stringBuilder.append(tempString.toString());
            }
            if (i == s.length() - 1) {
            } else {
                stringBuilder.append("-");
            }
        }
        return stringBuilder.toString();
    }
}
