public class HelpZoom {

    public static String helpZoom(final int[] key) {
        for (int i = 0; i < key.length; i++) {
            do {
                if (key[i] != key[key.length - 1 - i])
                    return "No";
            } while(key[i] == key.length / 2 - 1);
        }
        return "Yes";
    }
}
