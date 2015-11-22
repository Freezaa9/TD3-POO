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
abstract public class PolygoneAbs implements Polygone {

    int taille = 0;

    public PolygoneAbs(Point[] sommets) throws Exception {
        taille = sommets.length;
        if (taille < 3) {
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
        if (compteur > taille) {
            throw new Exception("Un polygone ne peut pas avoir deux points identiques");
        }
    }

    @Override
    public double perimetre() {
        double result = 0;
        Iterator<Point> it = this.iterator();
        Iterator<Point> it2 = this.iterator();
        Iterator<Point> it3 = this.iterator();
        it2.next();
        while (it.hasNext() && it2.hasNext()) {
            result += it.next().distance(it2.next());
        }
        result += it3.next().distance(it.next());
        return result;
    }

    @Override
    public double surface() {
        return -1;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof PolygoneLstCirc) && !(obj instanceof PolygoneTab)) {
            return false;
        }
        PolygoneAbs poly = (PolygoneAbs) obj;
        if (obj instanceof PolygoneLstCirc) {
            poly = (PolygoneLstCirc) obj;
        }
        if (obj instanceof PolygoneTab) {
            poly = (PolygoneTab) obj;
        }
        boolean b = false;
        for (Point p1 : this) {
            for (Point p2 : poly) {
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

    @Override
    public String texteSommets() {
        StringBuffer buff = new StringBuffer();
        for (Point p : this) {
            buff.append(p);
            buff.append(' ');
        }
        return buff.toString();
    }

    @Override
    public String toString() {
        StringBuffer buff = new StringBuffer();
        buff.append("Polygone à ");
        buff.append(taille);
        buff.append(" sommets : ");
        buff.append(this.texteSommets());
        return buff.toString();
    }

}
