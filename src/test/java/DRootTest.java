import org.junit.Test;

import static org.junit.Assert.*;

public class DRootTest {

    @Test
    public void digital_root() {

        assertEquals("Niewiem",3,DRoot.digital_root(9876));
        assertEquals("poCoTenMesedz", 6 ,DRoot.digital_root(123) );
    }
}