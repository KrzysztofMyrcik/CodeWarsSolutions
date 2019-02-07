import org.junit.Test;

import static org.junit.Assert.*;

public class HelpZoomTest {

    @Test
    public void helpZoom() {
        assertEquals("ok", "Yes", HelpZoom.helpZoom(new int[]{1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1}));
        assertEquals("nie ok", "No", HelpZoom.helpZoom(new int[]{1,1,0,1,1,0,0,0}));
        assertEquals("ok", "Yes", HelpZoom.helpZoom(new int[]{1,1,0,1,1,0,1,1}));
        assertEquals("ok", "Yes", HelpZoom.helpZoom(new int[]{1,2,3,4,5,0,5,4,3,2,1}));
    }
}