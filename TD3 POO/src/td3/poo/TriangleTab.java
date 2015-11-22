/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td3.poo;

/**
 * <h1>{@code Triangle} - Abstraction d'un Triangle</h1>
 * <p>
 * Cette classe encapsule les propriétés et les comportements propres à la
 * classe {@code Triangle}</p>
 *
 * @author Geoffrey Harrazi &amp; Lucas Morel
 * @version 1.0.0
 * @since 1.0.0
 *
 *
 */
public class TriangleTab extends PolygoneTab implements Polygone {

    /**
     * a, b et c sont la distance des cotés du triangle
     */
    double a, b, c;

    /**
     * <p>
     * Constructeur {@code Triangle} de Triangle qui prend en paramètre trois
     * points.
     * <p>
     * @param p1 Premier point du triangle
     * @param p2 Deuxième point du triangle
     * @param p3 Troisième point du triangle
     * @throws Exception si un triangle à moins de trois sommets et si il est
     * composé de deux sommets identique.
     * @see Polygone
     * @since V1.0.0
     */
    public TriangleTab(Point p1, Point p2, Point p3) throws Exception {
        super(new Point[]{p1, p2, p3});
        this.a = this.b = this. c = -1;
    }

    /**
     * <p>
     * Méthode qui calcul la surface d'un triangle
     * <p>
     *
     * @return Double : surface du triangle.
     *
     * @since V1.0.0
     */
     @Override
    public double surface() {
        if (a < 0 || b < 0 || c < 0) {
            calcABC();
        }
        double p = this.perimetre() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    //A valider
    public void calcABC() {
        this.a = this.getSommets()[0].distance(this.getSommets()[1]);
        this.b = this.getSommets()[1].distance(this.getSommets()[2]);
        this.c = this.getSommets()[2].distance(this.getSommets()[0]);
    }

    /**
     * <p>
     * Méthode qui retourne un string qui représente l'objet.
     * <p>
     *
     * @return String : un string qui représente l'objet.
     *
     * @since V1.0.0
     */
    @Override
    public String toString() {
        if (a < 0 || b < 0 || c < 0) {
            calcABC();
        }
        StringBuffer buff = new StringBuffer();
        buff.append("Triangle ");
        if (a == b && a == c) {
            buff.append("équilatèral ");
        } else if (a == b || a == c || b == c) {
            buff.append("isocèle ");
        } else {
            buff.append("scalène ");
        }
        buff.append(this.texteSommets());
        return buff.toString();
    }

}
