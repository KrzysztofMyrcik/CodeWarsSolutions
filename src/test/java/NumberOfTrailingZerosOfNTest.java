import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfTrailingZerosOfNTest {

    @Test
    public void zeros() {
        assertEquals("OK",1,NumberOfTrailingZerosOfN.zeros(6));
        assertEquals("OK",1,NumberOfTrailingZerosOfN.zeros(5));
        assertEquals("OK",3,NumberOfTrailingZerosOfN.zeros(16));
    }
}