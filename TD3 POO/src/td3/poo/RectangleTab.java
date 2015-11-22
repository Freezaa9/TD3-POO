/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td3.poo;

/**
 * <h1>{@code RectangleTab} - Abstraction d'un RectangleTab</h1>
 * <p>
 * Cette classe encapsule les propriétés et les comportements propres à la
 * classe {@code RectangleTab}</p>
 *
 * @author Geoffrey Harrazi &amp; Lucas Morel
 * @version 1.0.0
 * @since 1.0.0
 *
 *
 */
public class RectangleTab extends PolygoneTab {

    /**
     * a et b sont la distance de la largeur et de la longueur du rectangle
     */
    double a, b;

    /**
     * <p>
     * Constructeur {@code Rectangle} de Rectangle qui prend en paramètre deux
     * points.
     * <p>
     * @param sg Point supérieur gauche
     * @param id Point inférieur droit
     * @throws Exception si un rectangle à moins de trois sommets et si il est
     * composé de deux sommets identique.
     * @see Polygone
     * @since V1.0.0
     */
    public RectangleTab(Point sg, Point id) throws Exception {
        super(new Point[]{sg, new Point(sg.getX(), id.getY()), id, new Point(id.getX(), sg.getY())});
        this.a = this.b = -1;       
    }

    /**
     * <p>
     * Méthode qui calcul la surface d'un rectangle
     * <p>
     *
     * @return Double : surface du rectangle.
     *
     * @since V1.0.0
     */
    @Override
    public double surface() {
        if (a < 0 || b < 0) {
            this.a = this.getSommets()[0].distance(this.getSommets()[1]);
            this.b = this.getSommets()[0].distance(this.getSommets()[3]);
        }
        return a * b;
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
        StringBuffer buff = new StringBuffer();
        buff.append("Rectangle à plat ");
        buff.append(this.texteSommets());
        return buff.toString();
    }

}
