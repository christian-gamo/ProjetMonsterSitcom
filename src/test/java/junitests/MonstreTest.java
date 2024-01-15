package junitests;

import actors.ActorFactory;
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

    Monstre goreMagala = new Monstre();

    /**
     * Default constructor for test class junitests.MonstreTest
     */
    public MonstreTest()
    {
    }

    /**
     * Sets up the test fixture.
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {

    }

    /**
     * Tears down the test fixture.
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testGetCapaciteFetiche() {
        String expected = "Frenzy Virus";
        String actual = goreMagala.getCapaciteFetiche();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetCapaciteFetiche() {
        String expected = "Evolution";
        goreMagala.setCapaciteFetiche(expected);
        String actual = goreMagala.getCapaciteFetiche();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetPopulation() {
        int expected = 1;
        int actual = goreMagala.getPopulation();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetPopulation() {
        int expected = 5;
        goreMagala.setPopulation(expected);
        int actual = goreMagala.getPopulation();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetVoieExtinction() {
        boolean expected = false;
        boolean actual = goreMagala.getVoieExtinction();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetVoieExtinction() {
        boolean expected = true;
        goreMagala.setVoieExtinction(expected);
        boolean actual = goreMagala.getVoieExtinction();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetNom() {
        String expected = "Gore Magala";
        String actual = goreMagala.getNom();
        assertEquals(expected, actual);
    }

    @Test
    public void testEstChasse()
    {
        assertEquals(0, goreMagala.estChasse());
        assertTrue(goreMagala.getVoieExtinction());
    }

    @Test
    public void testConstructorExtinction()
    {
        Object[] data0 = {"Mizutsune", "Bulles", 0};
        Monstre mizutsune = (Monstre) ActorFactory.getActor("Monstre", data0);

        assert mizutsune != null;
        assertTrue(mizutsune.getVoieExtinction());
        assertEquals(0,mizutsune.getPopulation());

        Monstre rathalos = new Monstre("Rathalos", "Boules de feu", 0);
        assertTrue(rathalos.getVoieExtinction());
        assertEquals(0,rathalos.getPopulation());
    }


}

