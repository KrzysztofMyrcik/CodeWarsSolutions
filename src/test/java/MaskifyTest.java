import org.junit.Test;

import static org.junit.Assert.*;

public class MaskifyTest {

    @Test
    public void maskify() {
        assertEquals("whatDaFak", "##bcde", Maskify.maskify("aabcde"));
        assertEquals("aa","abcd", Maskify.maskify("abcd"));
        assertEquals("aa","", Maskify.maskify(""));
        assertEquals("aa","1", Maskify.maskify("1"));
    }
}