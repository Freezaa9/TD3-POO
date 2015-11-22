/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td3.poo;

import java.util.Iterator;

/**
 *
 * @author geoff
 */
public class PolygoneLstCirc extends PolygoneAbs implements Polygone {

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
            StringBuffer buff = new StringBuffer();
            buff.append(sommet.toString());
            if (suiv != null) {
                buff.append(' ');
                buff.append(suiv.toString());
            }
            return buff.toString();
        }

    }

    private Noeud debut; // Point d'entrée de la liste   

    public PolygoneLstCirc(Point[] sommets) throws Exception { // A améliorer, on peut surement faire q'une boucle
        super(sommets);
        Noeud[] tabN = new Noeud[sommets.length];
        debut = new Noeud(sommets[0], null);
        tabN[0] = debut;
        for (int i = 1; i < sommets.length; i++) {
            tabN[i] = new Noeud(sommets[i], null);
            tabN[i - 1].setSuiv(tabN[i]);
        }
    }

    @Override
    public Iterator<Point> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<Point> {

        private int indiceCourant = 0;

        @Override
        public boolean hasNext() {
            return indiceCourant < taille;
        }

        @Override
        public Point next() {
            int compt = 0;
            Noeud noeud = debut;
            while (compt < indiceCourant) {
                noeud = noeud.suiv;
                compt++;
            }
            indiceCourant++;
            return noeud.sommet;
        }

    }

}
