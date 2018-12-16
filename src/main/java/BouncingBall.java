public class BouncingBall {
    public static int bouncingBall(double h, double bounce, double window) {
        Integer count = 0;
        if(h != 0 && bounce != 0 && bounce < 1 && h > window && h*bounce > window){
            count ++;
            do {
                h = h * bounce;
                 if(h > window){
                     count += 2;
                 }
            }while (h > window);
            return count;
        }
        return -1;
    }
}