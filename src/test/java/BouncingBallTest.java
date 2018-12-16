import org.junit.Test;

import static org.junit.Assert.*;

public class BouncingBallTest {

    @Test
    public void bouncingBall() {
        assertEquals("Ok",3,BouncingBall.bouncingBall(3,0.66,1.5));
        assertEquals("OK",-1,BouncingBall.bouncingBall(3,0.49,1.5));
        assertEquals("OK",3,BouncingBall.bouncingBall(3,0.51,1.5));
    }
}