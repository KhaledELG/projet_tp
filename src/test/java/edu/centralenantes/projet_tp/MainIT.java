/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.centralenantes.projet_tp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author EL GHAMMARTI Khaled
 */
public class MainIT {
    
    public MainIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Main.
     */
    @Ignore
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Main.main(args);
        // TODO review the generated test code 
    }

    /**
     * Test of getNb_partie method, of class Main.
     */
    @Ignore
    @Test
    public void testGetNb_partie() {
        System.out.println("getNb_partie");
        int expResult = 0;
        int result = Main.getNb_partie();
        assertEquals(expResult, result);        
        // TODO review the generated test code 
    }

    /**
     * Test of AfficheGagnant method, of class Main.
     */
    
    @Ignore
    @Test
    public void testAfficheGagnant() {
        System.out.println("AfficheGagnant");
        Joueur joueur1 = new Joueur();
        Joueur joueur2 = new Joueur(joueur1);
        joueur1.setScore(10);
        joueur2.setScore(5);
        Main.AfficheGagnant(joueur1, joueur2);
        // TODO review the generated test code
    }

    /**
     * Test of getNb_tour_max method, of class Main.
     */
    @Ignore
    @Test
    public void testGetNb_tour_max() {
        System.out.println("getNb_tour_max");
        int expResult = 0;
        int result = Main.getNb_tour_max();
        assertEquals(expResult, result);
        // TODO review the generated test code
    }
    
}
