package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class MapTest {
    @Test
    public void InitializationCreatesResults() {
        Map testObj = new Map();
        assertNotNull(testObj.size);
    }
}
