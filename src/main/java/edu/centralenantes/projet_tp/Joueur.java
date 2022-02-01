/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.centralenantes.projet_tp;

import java.util.Scanner;

/**
 * Cette classe représente la classe qui modélise un joueur regroupant les 4 atributs d'un joueur, les 2 constructeurs et les getters/setters.
 * 
 * @author EL GHAMMARTI Khaled
 */
public class Joueur {
    private String name;
    private int nb_essais;
    private String role;
    private int score;
    
    /**
     * Ce constructeur génère un joueur à partir des données renseignées par le 
     * premier joueur 
     */
    public Joueur(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nom du premier joueur : ");
        String n = sc.nextLine();
        System.out.println("Role initial du premier joueur (codificateur ou decodeur) : ");
        String r = sc.nextLine();
        if (!r.equals("codificateur") && !r.equals("decodeur")) {
            System.out.println("Veuillez renseigner un role parmis ces deux la : codificateur ou decodeur : ");
            r = sc.nextLine();
        }
        this.name=n;
        this.role=r;
        this.score=0;
        this.nb_essais=0;
    }
    
    /**
     * Ce constructeur génère un joueur à partir des données renseignées par le 
     * deuxième joueur
     * 
     * @param j Cette variable correspond au joueur j qui sert à génèrer le 
     * deuxième joueur tout en faisant attention à ce qu'il n'ai pas le même 
     * rôle que le joueur j
     */    
    public Joueur(Joueur j){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nom du second joueur : ");
        String n = sc.nextLine();
        System.out.println("Role initial du second joueur (codificateur ou decodeur) : ");
        String r = sc.nextLine();
        if (r.equals(j.getRole())) {
            System.out.println("Attention, ce role est deja pris. Veuillez renseigner le second role : ");
            r = sc.nextLine();
        } else if (!r.equals("codificateur") && !r.equals("decodeur")) {
            System.out.println("Veuillez renseigner un role parmis ces deux la : codificateur ou decodeur : ");
            r = sc.nextLine();
        }
        this.name=n;
        this.role=r;
        this.score=0;
        this.nb_essais=0;        
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the nb_essais
     */
    public int getNb_essais() {
        return nb_essais;
    }

    /**
     * @param nb_essais the nb_essais to set
     */
    public void setNb_essais(int nb_essais) {
        this.nb_essais = nb_essais;
    }

    /**
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * @return the score
     */
    public int getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(int score) {
        this.score = score;
    }
}
