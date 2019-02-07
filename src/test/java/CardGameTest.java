import org.junit.Test;

import static org.junit.Assert.*;

public class CardGameTest {

    @Test
    public void game() {
        assertEquals(0,CardGame.game("2,3,4,5,6,7,8,t", "3,4,5,6,7,8,9,j"));
        assertEquals(3, CardGame.game("a,3,4","q,2,3"));

    }
}