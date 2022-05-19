package com.levelup.forestsandmonsters;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class PositionTest {
    @Test
    public void InitializationCreatesResults() {
        GameController testObj = new GameController();
        assertNotNull(testObj.status);
    }
}
