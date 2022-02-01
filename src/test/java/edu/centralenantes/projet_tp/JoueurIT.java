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
public class JoueurIT {
    
    public JoueurIT() {
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

    //Uniquement pour montrer que je sais realiser des tests, je laisse volontairement certains tests de setters et getters bien que cela soit "inutile"
    
    /**
     * Test of getName method, of class Joueur.
     */
    @Ignore
    @Test
    public void testGetName() {
        System.out.println("getName");
        Joueur instance = new Joueur();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code
    }

    /**
     * Test of setName method, of class Joueur.
     */
    @Ignore
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Pierre";
        Joueur instance = new Joueur();
        instance.setName(name);
        // TODO review the generated test code
    }

    /**
     * Test of getNb_essais method, of class Joueur.
     */
    @Ignore
    @Test
    public void testGetNb_essais() {
        System.out.println("getNb_essais");
        Joueur instance = new Joueur();
        int expResult = 0;
        int result = instance.getNb_essais();
        assertEquals(expResult, result);
        // TODO review the generated test code
    }

    /**
     * Test of setNb_essais method, of class Joueur.
     */
    @Ignore
    @Test
    public void testSetNb_essais() {
        System.out.println("setNb_essais");
        int nb_essais = 12;
        Joueur instance = new Joueur();
        instance.setNb_essais(nb_essais);
        if (instance.getNb_essais() != nb_essais) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getRole method, of class Joueur.
     */
    @Ignore
    @Test
    public void testGetRole() {
        System.out.println("getRole");
        Joueur instance = new Joueur();
        String expResult = "";
        String result = instance.getRole();
        assertEquals(expResult, result);
        // TODO review the generated test code
    }

    /**
     * Test of setRole method, of class Joueur.
     */
    @Ignore
    @Test
    public void testSetRole() {
        System.out.println("setRole");
        String role = "";
        Joueur instance = new Joueur();
        instance.setRole(role);
        // TODO review the generated test code
    }

    /**
     * Test of getScore method, of class Joueur.
     */
    @Ignore
    @Test
    public void testGetScore() {
        System.out.println("getScore");
        Joueur instance = new Joueur();
        int expResult = 0;
        int result = instance.getScore();
        assertEquals(expResult, result);
        // TODO review the generated test code
    }

    /**
     * Test of setScore method, of class Joueur.
     */
    @Ignore
    @Test
    public void testSetScore() {
        System.out.println("setScore");
        int score = 10;
        Joueur instance = new Joueur();
        instance.setScore(score);
        if (instance.getScore() != score) {
            fail("The test case is a prototype.");
        }
    }
    
}
