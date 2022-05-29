/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Modele.*;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

/**
 * @author eric.duchene
 */
public class VueGrille extends JComponent {
    Grille grille;
    int tailleCase;

    public VueGrille(Grille g) {
        this.grille = g;
    }

    public static Color getColor(int valeur) {
        switch (valeur) {
            case 2:
                return Color.lightGray;
            case 4:
                return Color.gray;
            case 8:
                return Color.pink;
            case 16:
                return Color.orange;

        }
        return null;
    }

    @Override
    protected void paintComponent(Graphics gra) {
        // a coder
    }

    @Override
    public Dimension getPreferredSize() {
        //a modifier
        return null;
    }


}
