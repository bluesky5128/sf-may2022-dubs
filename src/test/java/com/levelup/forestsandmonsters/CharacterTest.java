package com.levelup.forestsandmonsters;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class CharacterTest {
    @Test
    public void ReturnStartingPosition() {
        GameController testObj = new GameController();
        assertNotNull(testObj.status);
    }
}
