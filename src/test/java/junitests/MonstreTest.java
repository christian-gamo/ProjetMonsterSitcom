package junitests;

import actors.Monstre;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

/**
 * The test class junitests.MonstreTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MonstreTest
{

    /**
     * Default constructor for test class junitests.MonstreTest
     */
    public MonstreTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {

    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testEstChasse()
    {
        Monstre monstre1 = new Monstre("Mizutsune", "Bulles", 1);
        assertEquals(0, monstre1.estChasse());
        assertTrue(monstre1.getVoieExtinction());
    }
}

