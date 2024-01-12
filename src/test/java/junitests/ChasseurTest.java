package junitests;

import static org.junit.jupiter.api.Assertions.*;

import actors.Chasseur;
import actors.Monstre;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * The test class junitests.ChasseurTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ChasseurTest
{
    private Monstre mizutsune;
    private Chasseur darlene;

    /**
     * Default constructor for test class junitests.ChasseurTest
     */
    public ChasseurTest()
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
        mizutsune = new Monstre("Mizutsune", "Bulles", 1);
        darlene = new Chasseur("Darlène", 0, mizutsune);
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
    public void testPartirEnChasse()
    {
        assertEquals(0, darlene.getCptMonstresChasses());
        assertEquals(1, mizutsune.getPopulation());
        darlene.partirEnChasse();
        assertEquals(1, darlene.getCptMonstresChasses());
        assertEquals(0, mizutsune.getPopulation());
        assertTrue(mizutsune.getVoieExtinction());
    }
}

