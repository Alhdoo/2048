package Modele;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 * @author eric.duchene
 */
public class Grille {
    Case grille[][];
    int taille;

    public Grille(int taille) {
        this.taille = taille;
        grille = new Case[taille][taille];
        for (int i = 0; i < this.taille; i++) {
            for (int j = 0; j < this.taille; j++) {
                grille[i][j] = new Case(i, j);
            }
        }
    }

    public void reinitialiser(int taille) {
        this.taille = taille;
        for (int i = 0; i < this.taille; i++) {
            for (int j = 0; j < this.taille; j++) {
                grille[i][j] = new Case(i, j);
            }
        }
        ajoutElementAlea();
        ajoutElementAlea();
    }

    public boolean ajoutElementAlea() {//return false si plein et pas possible

        ArrayList<Case> vide = new ArrayList();
        int cpt = 0;
        for (int i = 0; i < this.taille; i++) {
            for (int j = 0; j < this.taille; j++) {
                if (grille[i][j].valeur == 0) ;
                {
                    vide.add(grille[i][j]);
                    cpt++;
                }
            }
        }
        if(cpt==0) return false;
        else return true;

    }

    public void pousserGauche() {
        //a coder
    }

    public void pousserHaut() {
        //a coder
    }

    public void pousserBas() {
        //a coder
    }

    public void pousserDroite() {
        //a coder
    }

    public int getTaille() {
        return taille;
    }

    public Case getCase(int i, int j) {
        //a modifier
        return null;
    }

    public String toString() {
        //a modifier
        return "";
    }
}
