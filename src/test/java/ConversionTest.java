import org.junit.Test;

import static org.junit.Assert.*;

public class ConversionTest {

    @Test
    public void solution() {
        assertEquals("Ok","MCMLV", Conversion.solution(1955));
        assertEquals("Ok","MMCXVIII", Conversion.solution(2118));
        assertEquals("Ok","MMMMCCCXXI", Conversion.solution(4321));
        assertEquals("Ok","MCCXXXIV", Conversion.solution(1234));
        assertEquals("Ok","MCXI", Conversion.solution(1111));
        assertEquals("Ok","MMMDXXIII", Conversion.solution(3523));
    }
}