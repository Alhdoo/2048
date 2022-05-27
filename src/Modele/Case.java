package Modele;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author eric.duchene
 */
public class Case {
    int ligne,colonne;
    int valeur; //si 0: case vide

    public Case(int ligne, int colonne) {
        this.ligne=ligne;
        this.colonne=colonne;
        valeur = 0;
    }

    public int getLigne() {
        return this.ligne;
    }

    public void setValeur(int valeur) {
        this.valeur=valeur;
    }

    public int getColonne() {
        return this.colonne;
    }

    public int getValeur() {
        return this.valeur;
    }
    
}
