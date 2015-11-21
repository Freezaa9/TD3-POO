/**
 * <h1>{@code Point} - Abstraction d'un point</h1>
 * <p>
 * Cette classe encapsule les propriétés et les comportements propres à la
 * classe {@code Point}</p>
 *
 * @author Geoffrey Harrazi &amp; Lucas Morel
 * @version 1.0.0
 * @since 1.0.0
 *
 */
package td3.poo;

import java.lang.Math;

/**
 *
 * @author Geoffrey
 */
public class Point {
            
    /**
     * valeur de l'ordonnée du point
     */
    private double x;
    /**
     * valeur de l'abscice du point
     */
    private double y;

    /**
     * <p>
     * Constructeur {@code Point} qui prend en paramètre la valeur de l'ordonée 
     * et de l'abscice du point.</p>
     * 
     * @param x valeur de l'ordonnée du point
     * @param y valeur de l'abscice du point 
     *
     * @since V1.0.0
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * <p>
     * Getter de x, l'ordonée du point</p>
     *
     * @return x un double
     *
     * @since V1.0.0
     */
    public double getX() {
        return this.x;
    }
    /**
     * <p>
     * Getter de y l'abscice du point</p>
     *
     * @return y un double
     *
     * @since V1.0.0
     */
    public double getY() {
        return this.y;
    }

    /**
     * <p>
     * Méthode de calcul de distance entre deux points     
     * <p>
     * @param p un Point
     * @return Double : La distance qui sépare deux points.
     *
     * @since V1.0.0
     */
    public double distance(Point p) {
        return Math.sqrt(Math.pow(this.getX() - p.getX(), 2) + Math.pow(this.getY() - p.getY(), 2));
    }

    /**
     * <p>
     * Méthode qui indique si deux réels sont égaux ou pas à 1e-10 près.      
     * <p>
     * @param x un Double
     * @param y un Double
     * @return Boolean : Les réels sont égaux ou pas à 1e-10 près. 
     *
     * @since V1.0.0
     */
    public static boolean memeReel(double x, double y) {
        return (Math.abs(x - y) < 0.0000000001);
    }

    /**
     * <p>
     * Méthode qui indique si deux Points ont des coordonées égales ou pas.      
     * <p>
     * @param obj Object    
     * @return Boolean : Les Points ont des coordonées égales ou pas. 
     *
     * @see memeReel
     * @since V1.0.0
     */
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Point p = (Point) obj;
        return (Point.memeReel(this.getX(), p.getX())) && (Point.memeReel(this.getY(), p.getY()));
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
    public String toString() {
        StringBuffer buff = new StringBuffer();
        buff.append('<');
        buff.append(this.getX());
        buff.append(',');
        buff.append(this.getY());
        buff.append('>');
        return buff.toString();
    }

}
