/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.centralenantes.projet_tp;

import java.util.ArrayList;
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
public class PartieIT {
    
    public PartieIT() {
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
     * Test of Jeu method, of class Partie.
     */
    @Ignore
    @Test
    public void testJeu() {
        System.out.println("Jeu");
        Joueur decodeur = new Joueur();
        Joueur codificateur = new Joueur(decodeur);
        Partie instance = new Partie();
        instance.Jeu(decodeur, codificateur);
        // TODO review the generated test code
    }

    /**
     * Test of getBonneCouleurBonnePlace method, of class Partie.
     */
    @Test
    public void testGetBonneCouleurBonnePlace() {
        System.out.println("getBonneCouleurBonnePlace");
        String combinaison = "RRRR";
        Partie instance = new Partie();
        instance.setCode_secret("RRVB");
        Object[] expResult = new Object[2];
        ArrayList<Integer> str = new ArrayList<>();
        str.add(0);
        str.add(1);
        expResult[0]= 2;
        expResult[1]=str;
        Object[] result = instance.getBonneCouleurBonnePlace(combinaison);
        assertArrayEquals(expResult, result);
        if (result[0] != expResult[0] && result[1] != expResult[1]) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getBonneCouleurMauvaisePlace method, of class Partie.
     */
    @Test
    public void testGetBonneCouleurMauvaisePlace() {
        System.out.println("getBonneCouleurMauvaisePlace");
        ArrayList<Integer> r = new ArrayList<>();
        r.add(0);
        r.add(1);
        String combinaison = "RRBR";
        Partie instance = new Partie();
        instance.setCode_secret("RRVB");
        int expResult = 1;
        int result = instance.getBonneCouleurMauvaisePlace(r, combinaison);
        assertEquals(expResult, result);
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getCode_secret method, of class Partie.
     */
    @Ignore
    @Test
    public void testGetCode_secret_Joueur() {
        System.out.println("getCode_secret");
        Joueur codificateur = new Joueur();
        Partie instance = new Partie();
        String expResult = "";
        String result = instance.getCode_secret(codificateur);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCode_secret method, of class Partie.
     */
    @Ignore
    @Test
    public void testGetCode_secret_0args() {
        System.out.println("getCode_secret");
        Partie instance = new Partie();
        String expResult = "";
        String result = instance.getCode_secret();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCode_secret method, of class Partie.
     */
    @Ignore
    @Test
    public void testSetCode_secret() {
        System.out.println("setCode_secret");
        String code_secret = "";
        Partie instance = new Partie();
        instance.setCode_secret(code_secret);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
