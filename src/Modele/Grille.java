package Modele;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

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
        if (cpt == 0) return false;
        Collections.shuffle(vide);
        double nb = Math.random();
        if (nb >= 5) {
            grille[vide.get(0).ligne][vide.get(0).colonne].valeur = 4;
        } else grille[vide.get(0).ligne][vide.get(0).colonne].valeur = 2;

        return true;

    }


    public void pousserGauche() {
        ArrayList<Case> row = new ArrayList<>();
        for (int i = 0; i < this.taille; i++) {
            for (int j = 1; j < this.taille; j++) {
                if(grille[i][j-1].valeur==grille[i][j].valeur)
                {
                    grille[i][j-1].valeur+=grille[i][j].valeur;
                    grille[i][j].valeur=0;
                }
            }
        }
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
        return grille[i][j];
    }

    public String toString() {
        //a modifier
        return "";
    }
}
