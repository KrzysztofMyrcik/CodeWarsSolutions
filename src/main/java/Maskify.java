public class Maskify {
    public static String maskify(String text) {
        StringBuilder string1 = new StringBuilder();
        StringBuilder string2 = new StringBuilder();
        if (text.length() <= 3) {
            return text;
        }
        for (int i = 0; i < text.length() - 4; i++) {
            string1.append("#");
        }
        for (int i = text.length() - 4; i < text.length(); i++) {
            string2.append(text.charAt(i));
        }
        return string1 + string2.toString();
    }
}
