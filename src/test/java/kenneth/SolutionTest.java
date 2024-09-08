package kenneth;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.sound.midi.Soundbank;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit Test for verifying App function(s)
 */
class SolutionTest {

    private Solution solution;
    private Integer n;

    @BeforeEach
    void setUp() {
        // Setting up variables before each unit test
        solution = new Solution();
    }

    @AfterEach
    void tearDown() {
        // Resetting variables after each unit test
        n = null;
    }

    @Test
    void example1() {
        n = 5;

        int expectedResult = 10;
        int actualResult = solution.smallestEvenMultiple(n);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void example2() {
        n = 6;

        int expectedResult = 6;
        int actualResult = solution.smallestEvenMultiple(n);

        assertEquals(expectedResult, actualResult);
    }
}