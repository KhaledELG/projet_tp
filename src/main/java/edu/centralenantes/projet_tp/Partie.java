/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.centralenantes.projet_tp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Cette classe représente une partie (qui se compose de 12 manches) modélisant 
 * une partie par le code secret donné par le codificateur ainsi que des 
 * méthodes permettant de simuler avec les différentes règles une partie.
 * 
 * @author EL GHAMMARTI Khaled
 */
public class Partie {
    private String code_secret;
    
    /**
     * @param decodeur Cette variable correspond au joueur avec le role decodeur
     * @param codificateur Cette variable correspond au joueur avec le role 
     * codificateur
     */
    public void Jeu(Joueur decodeur, Joueur codificateur){
        Scanner sc2 = new Scanner(System.in);
        this.getCode_secret(codificateur);
        //Debut des essais
        while (decodeur.getNb_essais()<= Main.getNb_tour_max()) {
            System.out.println("Quelle combinaison voulez vous soumettre ? ");
            String combinaison = sc2.nextLine();
            if (combinaison.length()!=4) {
                System.out.println(" S il vous plait, veuillez renseigner une combinaison a 4 caractères : ");
                combinaison = sc2.nextLine();
            } else if (!combinaison.equals(combinaison.toUpperCase())) {
                System.out.println(" Veuillez mettre en majuscule vos caractères s il vous plait :");
                combinaison = sc2.nextLine();
            } 
            if (combinaison.equals(this.getCode_secret())) {
                System.out.println("Vous avez trouve la bonne combinaison ! ");
                break;
            } else {
                Object[] a = this.getBonneCouleurBonnePlace(combinaison);
                System.out.println("Vous avez: " + String.valueOf(a[0])+" fiche(s) noire(s) (a la bonne couleur et a la bonne place)");
                System.out.println("Vous avez: " + String.valueOf(this.getBonneCouleurMauvaisePlace((ArrayList)a[1],combinaison))+" fiches(s) blanche(s) (a la bonne couleur mais a la mauvaise place)");
            }
            decodeur.setNb_essais(decodeur.getNb_essais()+1);
        }
        //On stocke le score
        codificateur.setScore(codificateur.getScore()+decodeur.getNb_essais());
        decodeur.setNb_essais(0);
        //Changement des rôles
        decodeur.setRole("codificateur");
        codificateur.setRole("décodeur");        
    }

    /**
     * @param combinaison Cette variable correspond à la combinaison émis par
     * le décodeur 
     * @return Retourne un tableau d'Objet regroupant le nombre de couleur à la 
     * bonne position et la liste des indices où se trouve les couleurs à la 
     * bonne position 
     */
    public Object[] getBonneCouleurBonnePlace(String combinaison) {
        int num = 0;
        ArrayList<Integer> r = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            if (combinaison.charAt(i) == this.code_secret.charAt(i)) {
                num += 1;
                r.add(i);
            }
        }
    	return new Object[] {num, r};
    }

    /**
     * @param r Cette variable correspond à la liste des indices où se trouve 
     * les couleurs à la bonne position
     * @param combinaison Cette variable correspond à la combinaison émis par
     * le décodeur
     * @return num Cette variable correspond aux nombres de couleurs correctement
     * saisis mais pas à la bonne position par le décodeur
     */
    public int getBonneCouleurMauvaisePlace(ArrayList r, String combinaison) {
        boolean[] counted = new boolean[]{false, false, false, false};
        int num = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //not right color right place
                if (i == j) continue;
                if (combinaison.charAt(j) == this.code_secret.charAt(j)) {
                    continue;
                }
                if (combinaison.charAt(i) == this.code_secret.charAt(j) && !counted[j] && !r.contains(i)) {
                    num += 1;
                    counted[j] = true;
                    break;
                }
            }
        }
    	return num;
    }
    
    /**
     * Cette méthode permet a récuperer le code secret en demandant au 
     * codificateur
     * 
     * @param codificateur Cette variable correspond au joueur possedant le rôle
     * de codificateur
     * @return code_secret Cette variable correspond au code secret indiqué par
     * le codificateur
     */
    public String getCode_secret(Joueur codificateur) {
        Scanner sc2 = new Scanner(System.in);
        System.out.println(codificateur.getName()+" donne ton code secret : ");
        String c_s = sc2.nextLine();
        if (c_s.length()!=4) {
            System.out.println(" S il vous plait, veuillez renseigner un code secret à 4 caractères : ");
            c_s = sc2.nextLine();
        } else if (!c_s.equals(c_s.toUpperCase())) {
            System.out.println(" Veuillez mettre en majuscule vos caractères s il vous plait :");
            c_s = sc2.nextLine();
        } 
        this.setCode_secret(c_s);
        return this.code_secret;
    }
    
    /**
     * @return the code_secret
     */
    public String getCode_secret() {
        return this.code_secret;
    }
    
    /**
     * @param code_secret the code_secret to set
     */
    public void setCode_secret(String code_secret) {
        this.code_secret = code_secret;
    }    
}
