package com.levelup.forestsandmonsters;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class CharacterTest {
    @Test
    public void ReturnStartingPosition() {
        Character myChar = new Character("test");
        assert(myChar.name == "test");
    }
}
