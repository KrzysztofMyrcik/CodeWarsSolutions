import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

public class LineTest {
        String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };

    @Test
    public void test2() {
        assertEquals("Sheldon", new Line().WhoIsNext(names, 5L));
        assertEquals("Penny", new Line().WhoIsNext(names, 52L));
    }
}