/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td3.poo;

import java.util.Iterator;

public class PolygoneTab implements Polygone {

    protected Point[] sommets;


    public PolygoneTab(Point[] sommets) throws Exception {

        if (sommets.length < 3) {
            throw new Exception("Un polygone ne peut pas avoir moins de trois points");
        }
        int compteur = 0;
        for (Point p1 : sommets) {
            for (Point p2 : sommets) {
                if (p1.equals(p2)) {
                    compteur++;
                }
            }
        }
        
        if (compteur > sommets.length) {
            throw new Exception("Un polygone ne peut pas avoir deux points identiques");
        }
        this.sommets = sommets;
    }


    public Point[] getSommets() {
        return this.sommets;
    }


    public double perimetre() {
        double result = 0;
        for (int i = 0; i < getSommets().length; i++) {
            result += getSommets()[i].distance(getSommets()[(i + 1) % getSommets().length]);
        }

        return result;
    }

    public double surface() {
        return -1;
    }

    public String texteSommets() {
        StringBuffer buff = new StringBuffer();
        for (Point p : sommets) {
            buff.append(p.toString());
            buff.append(' ');
        }
        return buff.toString();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof PolygoneTab)) {
            return false;
        }
        PolygoneTab poly = (PolygoneTab) obj;

        boolean b = false;
       for (Point p1 : sommets) {
            for (Point p2 : poly.sommets) {
                if ((p1.equals(p2))) {
                    b = true;
                }
            }
            if (b == false) {
                return false;
            }
            b = false;
        }
        return true;
    }


    public String toString() {
        StringBuffer buff = new StringBuffer();
        buff.append("Polygone à ");
        buff.append(this.getSommets().length);
        buff.append(" sommets ");
        buff.append(this.texteSommets());
        return buff.toString();
    }

    @Override        
    public Iterator<Point> iterator() {
        return new Itr();
    }
    
    private class Itr implements Iterator<Point> {
        private int indiceCourant = 0;
        
        @Override
        public boolean hasNext() {
            return indiceCourant < sommets.length;
        }

        @Override
        public Point next() {
            return sommets[indiceCourant++];
        }
        
    }
}
