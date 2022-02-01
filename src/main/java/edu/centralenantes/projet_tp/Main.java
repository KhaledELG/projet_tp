/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.centralenantes.projet_tp;	
//Ceci importe la classe Scanner du package java.util
import java.util.Scanner; 

/**
 * Cette classe représente le main permettant le lancement et la coordination 
 * des différentes parties du programme.
 * 
 * @author EL GHAMMARTI Khaled
 * @version 1.0
 */
public class Main {
    private static final int nb_tour_max = 12;
    private int nb_partie;
    
    /**
     * Cette méthode correspond au main
     * 
     * @param args Arguments de la ligne de commande
     */
    public static void main (String[] args){
        //Affichage des règles
        System.out.println("Bienvenue !");
        System.out.println("Apres avoir pris connaissance des regles de jeu, je vais vous indiquer une maniere d'ecrire votre combinaison en tenant compte de la modelisation utilisee dans ce programme :");
        System.out.println("Les couleurs disponibles sont : J - jaune, B - bleu, R - rouge, V - vert, N - noir, W - blanc");
        System.out.println("Les combinaisons doivent etre ecrite dans le format suivant : XXXX exemple : RVBJ");
        System.out.println("Commencons !");
        //Création des joueurs
        //Joueur 1
        Joueur joueur1 = new Joueur();
        //Joueur 2
        Joueur joueur2 = new Joueur(joueur1);
        //Demande du nombre de parties souhaitées (pair)
        int nb_partie = Main.getNb_partie();
        //Début du jeu
        int compteur_de_partie =0;
        while (compteur_de_partie <= nb_partie-1) {
            Partie partie = new Partie();
            if (joueur1.getRole().equals("codificateur")) {
                partie.Jeu(joueur2, joueur1);
            } else {
                partie.Jeu(joueur1, joueur2);
            }
            compteur_de_partie = compteur_de_partie + 1;
        }
        //Afficher le gagnant
        AfficheGagnant(joueur1,joueur2);
    }

    /**
     * Cette méthode permet d'avoir le nombre de partie que les joueurs veulent jouer
     * 
     * @return nb_partie Cette variable correspond aux nombres de parties que les joueurs souhaientent jouer
     */
    public static int getNb_partie() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Donner le nombre de parties souhaitees (pair): ");
        int nb_p = sc.nextInt();
        if (nb_p%2!=0) {
            System.out.println("Attention, le nombre de parties doit etre pair. Veuillez renseigner le nombre de parties souhaitees : ");
            nb_p = sc.nextInt();
        }
        return nb_p;
    }
    
    /**
     * Cette méthode permet d'afficher le gagnant à la fin des parties jouées
     * 
     * @param joueur1 Cette variable correspond au premier joueur 
     * @param joueur2 Cette variable correspond au second joueur
     */
    public static void AfficheGagnant(Joueur joueur1, Joueur joueur2){
        if (joueur1.getScore()>joueur2.getScore()) {
            System.out.println("Le gagnant est : "+joueur1.getName()+" avec "+ joueur1.getScore()+"points contre "+joueur2.getScore()+"points pour "+joueur2.getName()+" !");
        } else {
            System.out.println("Le gagnant est : "+joueur2.getName()+" avec "+ joueur2.getScore()+"points contre "+joueur1.getScore()+"points pour "+joueur1.getName()+" !");
        }
    }

    /**
     * Cette méthode permet la récupération du nombre de tour max par partie
     * 
     * @return nb_tour_max Cette variable correspond au nombre de tour max par partie
     */
    public static int getNb_tour_max() {
        return nb_tour_max;
    }
}
