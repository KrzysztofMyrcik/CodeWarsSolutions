import org.junit.Test;

import static org.junit.Assert.*;

public class HelpZoomTest {

    @Test
    public void helpZoom() {
        assertEquals("ok", "Yes", HelpZoom.helpZoom(new int[]{1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1}));
        assertEquals("nie ok", "No", HelpZoom.helpZoom(new int[]{1,1,0,1,1,0,0,0}));
        assertEquals("ok", "Yes", HelpZoom.helpZoom(new int[]{1,1,0,1,1,0,1,1}));
    }
}