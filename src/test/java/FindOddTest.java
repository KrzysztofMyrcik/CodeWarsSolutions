import org.junit.Test;

import static org.junit.Assert.*;

public class FindOddTest {

    @Test
    public void findIt() {
        assertEquals("OK",1,FindOdd.findIt(new int[]{1,2,3,4,5,6,7,8,9,9,8,7,6,5,4,3,2}));
        assertEquals("OK",2,FindOdd.findIt(new int[]{2}));
        assertEquals("OK",1,FindOdd.findIt(new int[]{51,51,51,51,1,51,51,51,51}));
    }
}