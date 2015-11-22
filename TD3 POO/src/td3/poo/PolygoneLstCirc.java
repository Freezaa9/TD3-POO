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
public class PolygoneLstCirc extends PolygoneTab {

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
            tabN[i-1].setSuiv(tabN[i]);
        }
    }
    
//    @Override
//    public double perimetre() {
//        double result=0;
//        Noeud noeud = debut;
//        while(noeud.suiv != null){
//            result += noeud.sommet.distance(noeud.suiv.sommet);
//            noeud = noeud.suiv;
//        }
//        result += debut.sommet.distance(noeud.sommet);
//        return result;
//    }

//    public String toString() {
//        StringBuffer buff = new StringBuffer();
//        buff.append("Polygone, sommet : ");
//        buff.append(debut.toString());
//        return buff.toString();
//    }    
//    
}
