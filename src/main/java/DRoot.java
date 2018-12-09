public class DRoot {

    public static void main(String[] args) {
        System.out.println(digital_root(9876));
    }

    public static int digital_root(int n) {
        n = loop(n);
        if(n > 10){
         n = loop(n);
        }
            return n;
    }
    private static int loop(int n) {
        int result = 0;
        int[] intTab = String.valueOf(n).chars().map(Character::getNumericValue).toArray();
        for (int i = 0; i < intTab.length; i++) {
            result += intTab[i];
        }
        if(result == 10){
            result = 1;
        }
        return result;
    }
}
