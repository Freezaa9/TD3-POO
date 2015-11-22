/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td3.poo;

import java.util.Iterator;

public class PolygoneTab extends PolygoneAbs implements Polygone {

    protected Point[] sommets;

    public PolygoneTab(Point[] sommets) throws Exception {
        super(sommets);
        this.sommets = sommets;
    }

    public Point[] getSommets() {
        return this.sommets;
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
            return sommets[indiceCourant++];
        }

    }
}
