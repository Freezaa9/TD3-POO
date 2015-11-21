/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td3.poo;


/**
 * <h1>{@code Polygone} - Abstraction d'un polygone</h1>
 * <p>
 * Cette classe encapsule les propriétés et les comportements propres à la
 * classe {@code Polygone}</p>
 *
 * @author Geoffrey Harrazi &amp; Lucas Morel
 * @version 1.0.0
 * @since 1.0.0
 *
 * 
 */
public class PolygoneTab implements Polygone {

    protected Point[] sommets;

    /**
     * <p>
     * Constructeur {@code Polygone} de polygone qui prend en paramètre un
     * tableau de points (les sommets du polygone).
     * <p>
     * @param sommets Point[]
     *@throws Exception si un polygonne à moins de trois sommets et si il est composé 
     * de deux sommets identique.
     * 
     * @since V1.0.0
     */
    public PolygoneTab(Point[] sommets) throws Exception {

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
        this.sommets = sommets;
    }

    /**
     * <p>
     * Getteur de sommets
     * <p>
     * @return Point[] Retourne le tableau de point sommets
     *
     * @since V1.0.0
     */
    public Point[] getSommets() {
        return this.sommets;
    }

    /**
     * <p>
     * Méthode qui calcul et retourne le périmètre d'un polygone.
     * <p>
     * @return Double : Le périmètre du polygone
     *
     * @since V1.0.0
     */
    public double perimetre() {
        double result = 0;
        for (int i = 0; i < getSommets().length; i++) {
            result += getSommets()[i].distance(getSommets()[(i + 1) % getSommets().length]);
        }

        return result;
    }

    /**
     * <p>
     * Méthode qui retourne -1
     * <p>
     * @return Double
     *
     * @since V1.0.0
     */
    public double surface() {
        return -1;
    }

    /**
     * <p>
     * Méthode qui renvoie un String contenant la liste des sommets qui compose
     * le polygone
     * <p>
     * @return String : liste des sommets du polygone
     *
     * @since V1.0.0
     */
    public String texteSommets() {
        StringBuffer buff = new StringBuffer();
        for (Point p : getSommets()) {
            buff.append(p.toString());
            buff.append(' ');
        }
        return buff.toString();
    }

    /**
     * <p>
     * Méthode qui vérifie si deux polygone sont égaux ou pas.
     * <p>
     * @param obj Object
     * @return Boolean : si les polygones sont égaux
     *
     * @since V1.0.0
     */
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof PolygoneTab)) {
            return false;
        }
        PolygoneTab poly = (PolygoneTab) obj;

        boolean b = false;
        for (int i = 0; i < this.getSommets().length; i++) {
            for (int j = 0; j < poly.getSommets().length; j++) {
                if ((this.getSommets()[i].equals(poly.getSommets()[j]))) {
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
        buff.append("Polygone à ");
        buff.append(this.getSommets().length);
        buff.append(" sommets ");
        buff.append(this.texteSommets());
        return buff.toString();
    }

}
