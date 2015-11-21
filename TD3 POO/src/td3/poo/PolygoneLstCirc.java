/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td3.poo;

/**
 *
 * @author geoff
 */
public class PolygoneLstCirc implements Polygone {

    private class Noeud { // Class interne Noeud (inner class)

        Point sommet;
        Noeud suiv;

        public Noeud(Point sommet, Noeud suiv) {
            this.sommet = sommet;
            this.suiv = suiv;
        }

        public void setSuiv(Noeud suiv) {
            this.suiv = suiv;
        }

        public String toString() {
            // A coder
            return "A coder";
        }

    }

    private Noeud debut; // Point d'entrée de la liste

    public PolygoneLstCirc(Point[] sommets) throws Exception {

        if (sommets.length < 3) {
            throw new Exception("Un polygone ne peut pas avoir moins de trois points");
        }
        int compteur = 0;
        for (int i = 0; i < sommets.length; i++) {
            for (int j = 0; j < sommets.length; j++) {
                if (sommets[i].equals(sommets[j])) {
                    compteur++;
                }
            }
        }
        if (compteur > sommets.length) {
            throw new Exception("Un polygone ne peut pas avoir deux points identiques");
        }

        Noeud[] tabN = new Noeud[sommets.length];
        debut = new Noeud(sommets[0], null);
        tabN[0] = debut;
        for (int i = 1; i < sommets.length; i++) {
            tabN[i] = new Noeud(sommets[i], null);
        }
        for (int i = 0; i < tabN.length - 1; i++) {
            tabN[i].setSuiv(tabN[i + 1]);
        }

    }

    @Override
    public Point[] getSommets() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double perimetre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double surface() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String texteSommets() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String toString() {
        // A coder
        return "A coder";
    }

}
