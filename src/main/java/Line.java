import java.util.Arrays;
import java.util.LinkedList;
//not workig
public class Line {
        public static void main(String[] args) {
       String[] names = {"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
       System.out.println(WhoIsNext(names, 7230702951L));
   }
    public static String WhoIsNext(String[] names, Long n) {
        LinkedList<String> nameList = new LinkedList<>();
        nameList.addAll(Arrays.asList(names));
        for (int i = 0; i < n; i++) {
            nameList.addLast(nameList.getFirst());
            nameList.addLast(nameList.getFirst());
            System.out.println(nameList.removeFirst() + i);
        }
        return nameList.getFirst();
    }
}
