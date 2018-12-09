import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AccumulTest {
private static void testing (String actual, String expected){
    assertEquals(expected, actual);

    }
    @Test
    public void accum(){
    testing(Accumul.accum("abc"), "A-Bb-Ccc");
    testing(Accumul.accum("aBcD"), "A-Bb-Ccc-Dddd");
    }

}