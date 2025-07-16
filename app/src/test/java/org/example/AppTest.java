package org.example;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test
    void removeDuplicatesRemovesRepeatedItems() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3));
        ArrayList<Integer> result = App.removeDuplicates(input);
        assertEquals(3, result.size());
        assertTrue(result.containsAll(Arrays.asList(1, 2, 3)));
    }
}
